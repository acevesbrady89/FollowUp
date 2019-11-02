package com.iteso.eduardo.followup2;

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

        webView.loadUrl("https://docs.google.com/document/d/16u37YPLuX5BMAGeF8TJcC9a6REHVSxOCn9HMN0_OI6I/edit?usp=sharing");
        finish();

    }
}
