package com.example.mackendy.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class OfertasAcadem extends AppCompatActivity {
    //**********declaración las variables y implementar el plug in en el gradle*******//
    PDFView pdfView;
    private TextView infoTextView,infoTextView2;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas_academ);
////******* poner la flechita en el toolbal******//
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //*****implementación del documento*********///
        pdfView.fromAsset("lic.pdf").load();

//***** asignatura de las varaiables****//
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        pdfView=(PDFView)findViewById(R.id.pdfView);
        //*********que aparezca el los iconos ******////////

        bottomNavigationView.setItemIconTintList(null);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 if (item.getItemId() == R.id.licenciaItem) {
                    pdfView.fromAsset("lic.pdf").load();
                    //Intent intentar=new Intent(TitualacionActivity.this, LicActivity.class);
                    //startActivity(intentar);
                } else if (item.getItemId() == R.id.ingenieriaItem) {
                    pdfView.fromAsset("ingofer.pdf").load();
                    // Intent intentar=new Intent(TitualacionActivity.this, IngActivity.class);
                    //startActivity(intentar);
                }

                return false;
            }
        });
    }
}
