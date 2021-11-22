package com.alpha.csunshare;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebViewClient;
import android.os.Bundle;
import android.webkit.WebView;

public class ig1 extends AppCompatActivity
{
    WebView webView;
    String url = "https://www.instagram.com/csunshare";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig1);


        webView = findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
    }

}