package presentation.webview

import android.content.Context
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import java.io.BufferedReader
import java.io.InputStreamReader

class AdBlockWebViewClient(
    private val context: Context,
    private val adBlockEnabled: Boolean
) : WebViewClient() {
    private val blockedDomains: Set<String> by lazy { loadBlockedDomains() }

    override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
        if (!adBlockEnabled || request == null) return super.shouldInterceptRequest(view, request)
        val url = request.url.toString()
        if (isBlocked(url)) {
            // Block by returning empty response
            return WebResourceResponse("text/plain", "utf-8", null)
        }
        return super.shouldInterceptRequest(view, request)
    }

    private fun isBlocked(url: String): Boolean {
        val host = try {
            android.net.Uri.parse(url).host ?: ""
        } catch (e: Exception) {
            ""
        }
        return blockedDomains.any { domain -> host.contains(domain, ignoreCase = true) }
    }

    private fun loadBlockedDomains(): Set<String> {
        return try {
            val inputStream = context.assets.open("blocked_domains.txt")
            val reader = BufferedReader(InputStreamReader(inputStream))
            reader.lineSequence().map { it.trim() }.filter { it.isNotEmpty() }.toSet()
        } catch (e: Exception) {
            emptySet()
        }
    }
}
