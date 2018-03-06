package com.example.jose.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jose on 06/03/2018.
 */

public class MySplash  extends AppCompatActivity implements Animation.AnimationListener{
    TextView tv_texto_splash;
    ImageView iv_imagen_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();

        tv_texto_splash = (TextView)findViewById(R.id.tv_texto_splash);
        iv_imagen_splash = (ImageView)findViewById(R.id.tv_imagen_splah);

        Typeface font= Typeface.createFromAsset(getAssets(),"AmaticSC-Regular.ttf");
        tv_texto_splash.setTypeface(font);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.animacion2);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.animacion1);
        tv_texto_splash.startAnimation(myanim);
        iv_imagen_splash.startAnimation(myanim2);
        myanim.setAnimationListener(this);
    }
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(MySplash.this,MyLogin.class);

        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
