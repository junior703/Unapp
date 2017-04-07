package com.example.mackendy.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

public class Splash extends Activity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        button = (Button)findViewById(R.id.button);

//**** animacion***///
        ScaleAnimation scale = (ScaleAnimation) AnimationUtils.loadAnimation(this, R.anim.scale);
        button.setAnimation(scale);

        //****metodo para que funciona  el splash y tambien para la durecion****//

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

            }
        },4000);

        //****************para que pueda salir con el boton back on pressed del telefono********///

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();

            }
        },4000);

    }
}
