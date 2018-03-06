package com.example.jose.myapplication;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Jose on 06/03/2018.
 */

public class MyMain extends AppCompatActivity {
    private SwipeRefreshLayout srf_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }
    public boolean onCreateOptionsMenu(Menu menu) {



        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;

    }

}
