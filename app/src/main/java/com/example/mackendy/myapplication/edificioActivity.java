package com.example.mackendy.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class edificioActivity extends AppCompatActivity {

    //**********declaración las variables y implementar el plug in en el gradle*******//
    CircleMenu circleMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificio);

        ////******* poner la flechita en el toolbal******//
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//***** asignatura de las varaiables****//
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

//********ajustar el menu con imagenes y colores****//
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.icon_menu, R.mipmap.icon_cancel);
        circleMenu.addSubMenu(Color.parseColor("#8A39FF"), R.drawable.a)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.g)
                .addSubMenu(Color.parseColor("#f50057"), R.drawable.c)
                .addSubMenu(Color.parseColor("#2f5fda"), R.drawable.po);
              //  .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.e)
                //.addSubMenu(Color.parseColor("#1a237e"), R.drawable.f);


//*********metodo para que tenga funcion lo botones en el menu circulo*******//

        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(edificioActivity.this, "A", Toast.LENGTH_SHORT).show();
                                                             Intent A=new Intent(edificioActivity.this, FloatEdif.class);
                                                             startActivity(A);
                                                             break;
                                                         case 1:
                                                             Toast.makeText(edificioActivity.this, "G", Toast.LENGTH_SHORT).show();
                                                             Intent B=new Intent(edificioActivity.this, EdifB.class);
                                                             startActivity(B);
                                                             break;
                                                         case 2:
                                                             Toast.makeText(edificioActivity.this, "C", Toast.LENGTH_SHORT).show();
                                                             Intent C=new Intent(edificioActivity.this, EdifC.class);
                                                             startActivity(C);
                                                             break;
                                                         case 3:
                                                             Toast.makeText(edificioActivity.this, "I", Toast.LENGTH_SHORT).show();
                                                             Intent D=new Intent(edificioActivity.this, EdifD.class);
                                                             startActivity(D);
                                                            // startActivity(new Intent(MainActivity.this, TwoActivity.class));
                                                             break;
                                                      /*   case 4:
                                                             Toast.makeText(edificioActivity
                                                                     .this, "E", Toast.LENGTH_SHORT).show();
                                                             break;
                                                         case 5:
                                                             Toast.makeText(edificioActivity
                                                                     .this, "F", Toast.LENGTH_SHORT).show();
                                                             break;*/
                                                     }
                                                 }
                                             }

        );

        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {

                                                     }

                                                     @Override
                                                     public void onMenuClosed() {

                                                     }
                                                 }
        );

    }
    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }
}
