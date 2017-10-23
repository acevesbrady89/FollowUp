package com.aceves89gmail.sergio.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class activity_aboutus extends AppCompatActivity {
private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        webView = (WebView) findViewById(R.id.activity_aboutus_webview);

        webView.loadUrl("file:///android_asset/PrivacyPolicy.html");

    }
}
