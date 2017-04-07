package com.example.mackendy.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ReglActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regl);
//*****implementación del documento*********///
        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("reglamento.pdf").load();
////******* poner la flechita en el toolbal******//
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
