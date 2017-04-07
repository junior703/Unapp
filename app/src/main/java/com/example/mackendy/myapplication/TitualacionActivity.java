package com.example.mackendy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class TitualacionActivity extends AppCompatActivity {
    //**********declaración las variables y implementar el plug in en el gradle*******//
    PDFView pdfView;
    private TextView infoTextView,infoTextView2;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titualacion);
        //infoTextView = (TextView) findViewById(R.id.infoTextView);
       // infoTextView2 = (TextView) findViewById(R.id.infoTextView2);

//***** asignatura de las varaiables****//
        pdfView=(PDFView)findViewById(R.id.pdfView);
        //*****implementación del documento*********///
        pdfView.fromAsset("TsuIngg.pdf").load();

        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        //*********que aparezca el los iconos ******////////
        bottomNavigationView.setItemIconTintList(null);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.TSUItem) {
                    pdfView.fromAsset("TsuIngg.pdf").load();
                    // Intent intentar=new Intent(TitualacionActivity.this, TsuActivity.class);
                    //startActivity(intentar);
                    //infoTextView.setText(R.string.tsu);
                } if (item.getItemId() == R.id.licenciaItem) {
                    pdfView.fromAsset("estatal.pdf").load();
                    //Intent intentar=new Intent(TitualacionActivity.this, LicActivity.class);
                    //startActivity(intentar);
                }  if (item.getItemId() == R.id.ingenieriaItem) {
                    pdfView.fromAsset("federal.pdf").load();
                   // Intent intentar=new Intent(TitualacionActivity.this, IngActivity.class);
                    //startActivity(intentar);
                }

                return false;
            }
        });
    }
}
