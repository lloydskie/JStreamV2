package presentation.ui.components

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.unit.dp
import presentation.ui.animation.FadeInImage
import presentation.ui.animation.LoadingSkeleton

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun TrailerPlayer(
    videoUrl: String?,
    thumbnailUrl: String?,
    autoPlay: Boolean,
    modifier: Modifier = Modifier
) {
    var isMuted by remember { mutableStateOf(true) }
    var isLoading by remember { mutableStateOf(true) }
    var hasError by remember { mutableStateOf(false) }

    Box(modifier = modifier.height(220.dp)) {
        if (isLoading && thumbnailUrl != null) {
            FadeInImage(url = thumbnailUrl, contentDescription = "Trailer Thumbnail", modifier = Modifier.fillMaxSize())
        }
        if (videoUrl != null && !hasError) {
            AndroidView(
                factory = { ctx ->
                    @SuppressLint("SetJavaScriptEnabled")
                    WebView(ctx).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                        settings.javaScriptEnabled = true
                        settings.mediaPlaybackRequiresUserGesture = false
                        webChromeClient = WebChromeClient()
                        webViewClient = object : WebViewClient() {
                            override fun onPageFinished(view: WebView?, url: String?) {
                                isLoading = false
                            }
                            override fun onReceivedError(view: WebView?, request: android.webkit.WebResourceRequest?, error: android.webkit.WebResourceError?) {
                                hasError = true
                            }
                        }
                        val muteJs = if (isMuted) "&mute=1" else ""
                        val autoPlayJs = if (autoPlay) "&autoplay=1" else ""
                        val embedUrl = "$videoUrl?enablejsapi=1$autoPlayJs$muteJs"
                        loadUrl(embedUrl)
                    }
                },
                update = { webView ->
                    val muteJs = if (isMuted) "&mute=1" else ""
                    val autoPlayJs = if (autoPlay) "&autoplay=1" else ""
                    val embedUrl = "$videoUrl?enablejsapi=1$autoPlayJs$muteJs"
                    webView.loadUrl(embedUrl)
                },
                modifier = Modifier.fillMaxSize()
            )
        }
        if (hasError) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Trailer unavailable", color = MaterialTheme.colorScheme.error)
            }
        }
        // Unmute button
        if (isMuted && !isLoading && !hasError) {
            Button(
                onClick = { isMuted = false },
                modifier = Modifier.align(Alignment.BottomEnd).padding(8.dp)
            ) {
                Text("Unmute")
            }
        }
    }
}
