package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rg3 extends AppCompatActivity {

    EditText eid , ephn , emailid  ;
    Button next33 ;
    String  eid1 , ephn1 , emailid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rg3);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        toolbar.setTitle("123");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        eid = (EditText)findViewById(R.id.Eid);
        ephn = (EditText)findViewById(R.id.Ephn);
        emailid = (EditText)findViewById(R.id.EmailID);

        next33 = (Button)findViewById(R.id.Next3);
        next33.setOnClickListener(new View.OnClickListener() {
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
            Toast.makeText(this, "Fill the details properly", Toast.LENGTH_SHORT).show();
        }
        else {
            onLogin();
        }

    }

    public void onLogin()
    {
        Intent i1 = new Intent(Rg3.this,Rg4.class);
        startActivity(i1);
    }

    public boolean validate()
    {
        boolean valid = true ;

        if(eid1.isEmpty()){
            eid.setError("Please Enter Employee ID ");
            valid = false ;
        }
        else if(eid1.length()>5||eid1.length()<5){
            eid.setError("Please Enter Employee ID ");
            valid = false ;
        }
//        else if(!eid1.matches("[0-9]{10}")){
//            eid.setError("Please Enter Valid Employee ID ");
//            valid = false ;
 //       }
        else if(ephn1.isEmpty()){
            ephn.setError("Please Enter Employee ID ");
            valid = false ;
        }
        else if(!ephn1.matches("[0-9]{10}")){
            ephn.setError("Please Enter Valid Phone Number");
            valid = false ;
        }
        else if(ephn1.length()>10||ephn1.length()<10){
            ephn.setError("Please Enter Phone Number ");
            valid = false ;
        }
        else if(emailid1.isEmpty()){
            emailid.setError("Please Enter Email ID");
            valid = false ;
        }
        else if(!emailid1.matches("[a-zA-Z0-9._-]+@[a-z]+\\\\.+[a-z]+")){
            emailid.setError("Please Enter Valid Email ID");
            valid = false ;
        }

        return valid ;
    }

    public void initialize()
    {
        eid1 = eid.getText().toString().trim();
        ephn1 = ephn.getText().toString().trim();
        emailid1 = emailid.getText().toString().trim();
    }
    public void fun4(View view) {
        Intent i = new Intent(Rg3.this,Rg4.class);
        startActivity(i);
    }
}
