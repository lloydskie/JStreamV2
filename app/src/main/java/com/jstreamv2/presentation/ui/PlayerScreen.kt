package com.jstreamv2.presentation.ui

import android.annotation.SuppressLint
import android.view.WindowManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import android.app.Activity

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun PlayerScreen(
    mediaType: String, // "movie" or "tv"
    movieId: Int? = null,
    seriesId: Int? = null,
    season: Int? = null,
    episode: Int? = null,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var loading by remember { mutableStateOf(true) }
    var error by remember { mutableStateOf(false) }

    val url = when (mediaType) {
        "movie" -> "https://www.vidking.net/embed/movie/${movieId}?color=e50914&autoPlay=true&nextEpisode=true&episodeSelector=true"
        "tv" -> "https://www.vidking.net/embed/tv/${seriesId}/${season}/${episode}?color=e50914&autoPlay=true&nextEpisode=true&episodeSelector=true"
        else -> ""
    }

    // Ad domains to block
    val adDomains = listOf("doubleclick.net", "googlesyndication.com", "adservice.google.com", "ads.yahoo.com", "adnxs.com", "adsafeprotected.com")

    BackHandler(onBack = onBack)

    // Keep screen on during playback
    DisposableEffect(context) {
        val activity = context as? Activity
        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        onDispose {
            activity?.window?.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    Box(modifier = modifier.fillMaxSize()) {
        AndroidView(
            factory = { ctx ->
                WebView(ctx).apply {
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    webViewClient = object : WebViewClient() {
                        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                            val url = request?.url?.toString() ?: ""
                            if (adDomains.any { url.contains(it) }) {
                                return true // Block ad domain
                            }
                            return false
                        }
                        override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                            loading = true
                            error = false
                        }
                        override fun onPageFinished(view: WebView?, url: String?) {
                            loading = false
                        }
                        override fun onReceivedError(view: WebView?, request: WebResourceRequest?, error: android.webkit.WebResourceError?) {
                            error = true
                        }
                    }
                    loadUrl(url)
                }
            },
            modifier = Modifier.fillMaxSize()
        )
        if (loading) {
            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary, strokeWidth = 4.dp, modifier = Modifier.align(androidx.compose.ui.Alignment.Center))
        }
        if (error) {
            ErrorView(message = "Failed to load player.", onRetry = { /* reload logic */ })
        }
    }
}
