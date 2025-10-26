package presentation.webview;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lpresentation/webview/AdBlockWebViewClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "adBlockEnabled", "", "(Landroid/content/Context;Z)V", "blockedDomains", "", "", "getBlockedDomains", "()Ljava/util/Set;", "blockedDomains$delegate", "Lkotlin/Lazy;", "isBlocked", "url", "loadBlockedDomains", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"})
public final class AdBlockWebViewClient extends android.webkit.WebViewClient {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final boolean adBlockEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy blockedDomains$delegate = null;
    
    public AdBlockWebViewClient(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean adBlockEnabled) {
        super();
    }
    
    private final java.util.Set<java.lang.String> getBlockedDomains() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.Nullable
    android.webkit.WebView view, @org.jetbrains.annotations.Nullable
    android.webkit.WebResourceRequest request) {
        return null;
    }
    
    private final boolean isBlocked(java.lang.String url) {
        return false;
    }
    
    private final java.util.Set<java.lang.String> loadBlockedDomains() {
        return null;
    }
}