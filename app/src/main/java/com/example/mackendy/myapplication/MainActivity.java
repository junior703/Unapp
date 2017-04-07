package com.example.mackendy.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,quejasFrag.OnFragmentInteractionListener {
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //************para hacer animacion de la pagina primncipal*********************//
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
//************intervalo de tiempo que van pasando las imagenes***********//
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
//******* boton de regresar que viene por defecto en el movil************//
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
//********************menu principal de la applicación*******************//
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment=null;
        Boolean fragSelect=false;

        if (id == R.id.nosotros) {
            Intent intentar=new Intent(MainActivity.this, NosotrosActivity.class);
            startActivity(intentar);
            // Handle the camera action
          // fragment=new fragNosotros();
            //fragSelect=true;
        }else if (id == R.id.edificios) {
            Intent intentar=new Intent(MainActivity.this, edificioActivity.class);
            startActivity(intentar);
            // Handle the camera action
            //  fragment=new fragNosotros();
            //fragSelect=true;
        }else if (id == R.id.titulacion) {
            Intent intentar = new Intent(MainActivity.this, TitualacionActivity.class);
            startActivity(intentar);

        }else if (id == R.id.ofetrtas) {
            Intent intentar = new Intent(MainActivity.this, OfertasAcadem.class);
            startActivity(intentar);
        }else if (id == R.id.caledarios) {
            Intent intentar = new Intent(MainActivity.this, CalendActivity.class);
            startActivity(intentar);

        }  else if (id == R.id.reglamento) {
            Intent intentar = new Intent(MainActivity.this, ReglActivity.class);
            startActivity(intentar);

        }else if (id == R.id.quejas) {
            Intent intentar = new Intent(MainActivity.this, SuggActivity.class);
            startActivity(intentar);

        }else if (id == R.id.calif) {
            Intent intentar = new Intent(MainActivity.this, CalifActivity.class);
            startActivity(intentar);

        }else if (id == R.id.becas) {
            Intent intentar = new Intent(MainActivity.this, BecasActivity.class);
            startActivity(intentar);

        }else if (id == R.id.taller) {
            Intent intentar = new Intent(MainActivity.this, TallActivity.class);
            startActivity(intentar);

        }else if (id == R.id.eventos) {
           Intent intentar = new Intent(MainActivity.this, EventActivity.class);
            startActivity(intentar);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
