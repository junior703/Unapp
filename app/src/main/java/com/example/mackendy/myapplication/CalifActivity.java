package com.example.mackendy.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CalifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calif);

////******* poner la flechita en el toolbal******//

        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//*******+vincular con la base de datos de la pagina web****//

        WebView view=(WebView)findViewById(R.id.webCalif);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://unapp.esy.es/login_form.php");

        view.setWebViewClient(new WebViewClient() {
            public boolean shouldOverriceUrlLoading(WebView view, String Uri){

                return false;
            }

    });
}
}
