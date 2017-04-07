package com.example.mackendy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LicActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lic);
//*****implementación del documento*********///
        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("informacion.pdf").load();
    }
}
