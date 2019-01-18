package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    public EditText uid , password ;
    public Button submit  ;
    public String uid1 , password1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        toolbar.setTitle("123");
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));

        uid = (EditText)findViewById(R.id.UserID);
        password = (EditText)findViewById(R.id.Password);

        submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                register();
            }
        });
    }

    public void register() {
        initialize();

        if (!validate()) {
            Toast.makeText(this, "LogIn has Failed", Toast.LENGTH_SHORT).show();
        }
        else {
            onLogin();
        }

    }

    public void onLogin()
    {
        Intent i1 = new Intent(loginpage.this,wlcm.class);
        startActivity(i1);
    }

    public boolean validate()
    {
        boolean valid = true ;

        if(uid1.isEmpty()||uid1.length()>5||uid1.length()<5){
            uid.setError("Please Enter Valid UserID");
            valid = false ;
        }
        if(password1.isEmpty()){
            password.setError("Please Enter Password");
            valid = false ;
        }

        return valid ;
    }

    public void initialize()
    {
        uid1 = uid.getText().toString().trim();
        password1 = password.getText().toString().trim();
    }

    public void fun2(View view) {
        Intent i = new Intent(loginpage.this,Rg1.class);
        startActivity(i);
    }
}

