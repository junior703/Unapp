package com.example.mackendy.myapplication;


import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

        import com.github.clans.fab.FloatingActionButton;
        import com.github.clans.fab.FloatingActionMenu;

public class EdifC extends AppCompatActivity {

    //**********declaración las variables y implementar el plug in en el gradle*******//
    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4, floatingActionButton5, floatingActionButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edif_c);

        ////******* poner la flechita en el toolbal******//
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //***** asignatura  de las varaiables****//

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.social_floating_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.dirtic);
        // floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floating_twitter);
       // floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floating_linkdin);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.coortuto);
        floatingActionButton4 = (FloatingActionButton) findViewById(R.id.aula20);
        floatingActionButton5 = (FloatingActionButton) findViewById(R.id.cooridio);
        floatingActionButton6 = (FloatingActionButton) findViewById(R.id.sala1a2);


//*********metodo para que tenga funcion lo botones flotantes*******//

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                /*Intent facebookIntent = getOpenFacebookIntent(MainActivity.this);
                startActivity(facebookIntent);*/

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(EdifC.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                //  final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                //final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.imagefloat);


                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                /*Intent facebookIntent = getOpenFacebookIntent(MainActivity.this);
                startActivity(facebookIntent);*/

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(EdifC.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                //  final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                //final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.imagefloat);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });
        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(EdifC.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                //  final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                //final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.imagefloat);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(EdifC.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                //  final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                //final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.imagefloat);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
        floatingActionButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(EdifC.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                //  final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                //final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.imagefloat);

                // ************para que sea visible*********///
                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();;
            }
        });
    }




}
