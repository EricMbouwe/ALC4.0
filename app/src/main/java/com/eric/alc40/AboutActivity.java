package com.eric.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class AboutActivity extends AppCompatActivity {

    public static final String EXTRA_URL="extra_Url";
    private WebView aboutWebview;
    private ProgressBar loadingProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutWebview = findViewById(R.id.about_webView);
        loadingProgressBar = findViewById(R.id.progressBar);
        Intent intent = getIntent();
        setTitle("About ALC 4.0");
    }
}
