package com.tuya.carlauncher;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Creamos una pantalla web interna para mostrar el diseño del launcher
        WebView webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        webView.setWebViewClient(new WebViewClient());
        // Carga el diseño que guardaremos en los archivos internos
        webView.loadUrl("file:///android_asset/index.html");
        
        setContentView(webView);
    }

    @Override
    public void onBackPressed() {
        // Evitamos que el botón de atrás de la radio cierre el launcher por error
    }
}
