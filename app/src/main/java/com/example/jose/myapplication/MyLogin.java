package com.example.jose.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jose on 06/03/2018.
 */

public class MyLogin extends AppCompatActivity {
    TextView tv_login_registrarse;
    Button bt_login;
    EditText et;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getSupportActionBar().hide();
        et= (EditText)findViewById(R.id.et_nombre);
        et2 = (EditText)findViewById(R.id.et_password);
        bt_login = (Button) findViewById(R.id.btn_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyLogin.this,MyMain.class);

                startActivity(intent);
                finish();
            }
        });
    }
}
