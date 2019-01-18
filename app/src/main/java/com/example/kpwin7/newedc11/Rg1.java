package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rg1 extends AppCompatActivity {

    EditText fname , mname , lname  ;
    Button next1 ;
    String  fname1 , mname1 , lname1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rg1);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("123");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });

        fname = (EditText)findViewById(R.id.Fname);
        mname = (EditText)findViewById(R.id.Mname);
        lname = (EditText)findViewById(R.id.Lname);

        next1 = (Button)findViewById(R.id.Next1);
        next1.setOnClickListener(new View.OnClickListener() {
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
        Intent i1 = new Intent(Rg1.this,Rg2.class);
        startActivity(i1);
    }

    public boolean validate()
    {
        boolean valid = true ;

        if(fname1.isEmpty()){
            fname.setError("Please Enter Name");
            valid = false ;
        }
        else if(!fname1.matches("[a-zA-Z]+")){
            fname.setError("Please Enter Valid Name");
            valid = false ;
        }
        else if(mname1.isEmpty()){
            mname.setError("Please Enter Name");
            valid = false ;
        }
        else if(!mname1.matches("[a-zA-Z]+")){
            mname.setError("Please Enter Valid Name");
            valid = false ;
        }
        else if(lname1.isEmpty()){
            lname.setError("Please Enter Name");
            valid = false ;
        }
        else if(!lname1.matches("[a-zA-Z]+")){
            lname.setError("Please Enter Valid Name");
            valid = false ;
        }

        return valid ;
    }

    public void initialize()
    {
        fname1 = fname.getText().toString().trim();
        mname1 = mname.getText().toString().trim();
        lname1 = lname.getText().toString().trim();
    }

}
