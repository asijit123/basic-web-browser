package com.example.webbrowserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button go;
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.url);
        go= findViewById(R.id.go);
        browser= findViewById(R.id.browser);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                browser.loadUrl(url.getText().toString());
                browser.getSettings().getJavaScriptEnabled();
                browser.setWebViewClient(new WebViewClient());
            }
        });

    }
}