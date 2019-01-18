package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void fun5(View view) {
        Intent i = new Intent(user.this,loginpage.class);
        startActivity(i);
    }
}
