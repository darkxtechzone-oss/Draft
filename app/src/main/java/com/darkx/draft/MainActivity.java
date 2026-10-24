package com.darkx.draft;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
    WebView w;
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
        s.setAllowFileAccess(true); s.setAllowUniversalAccessFromFileURLs(true);
        s.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        w.setWebViewClient(new WebViewClient());
        setContentView(w);
        w.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { if (w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
