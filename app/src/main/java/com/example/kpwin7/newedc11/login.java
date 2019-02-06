package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText uid,pwd;
    Button login;
    TextView reg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uid = (EditText)findViewById(R.id.uid);
        pwd = (EditText)findViewById(R.id.pwd);
        login = (Button)findViewById(R.id.login);
        reg = (TextView)findViewById(R.id.reg);
//        reg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(login.this,registration.class);
//                startActivity(i);
//            }
//        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i1 = new Intent(login.this,First.class);
//                startActivity(i1);
                String userid = uid.getText().toString();
                String password = pwd.getText().toString();
                String type = "Login";
                BackgroundWorker bw = new BackgroundWorker(login.this);
                bw.execute(type,userid,password);
            }
        });

    }

}
