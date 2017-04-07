package com.example.mackendy.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import static com.example.mackendy.myapplication.R.id.bottomNavigationView;

public class BecasActivity extends AppCompatActivity {

    //**********declaración las variables y implementar el plug in en el gradle*******//
    PDFView pdfView;
    private TextView infoTextView,infoTextView2;

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_becas);

//***** asignatura de las varaiables****//
        pdfView=(PDFView)findViewById(R.id.pdfView);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        //*****implementación del documento*********///
        pdfView.fromAsset("federal.pdf").load();

//*********que aparezca el los iconos ******////////
        bottomNavigationView.setItemIconTintList(null);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.BecasProf) {
                    pdfView.fromAsset("informacion.pdf").load();
                    //Intent intentar=new Intent(TitualacionActivity.this, LicActivity.class);
                    //startActivity(intentar);
                } else if (item.getItemId() == R.id.BecasAlum) {
                    pdfView.fromAsset("federal.pdf").load();
                    // Intent intentar=new Intent(TitualacionActivity.this, IngActivity.class);
                    //startActivity(intentar);
                }

                return false;
            }
        });
    }
}
