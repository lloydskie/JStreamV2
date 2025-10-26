package com.jstreamv2.presentation.ui

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun TrailerPlayer(
    videoUrl: String?,
    thumbnailUrl: String? = null,
    autoPlay: Boolean = true,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier
) {
    if (videoUrl == null) return
    val autoplayParam = if (autoPlay) "1" else "0"
    val url = "$videoUrl?autoplay=$autoplayParam&playsinline=1"
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                settings.mediaPlaybackRequiresUserGesture = false
                loadUrl(url)
            }
        },
        modifier = modifier
    )
}
