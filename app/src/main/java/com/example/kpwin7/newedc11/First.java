package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;

public class First extends AppCompatActivity {

    private DrawerLayout drawerLayout1 ;
    public ImageButton im11 ;
    private ActionBarDrawerToggle mToggle ;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        drawerLayout1 = (DrawerLayout)findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this,drawerLayout1,R.string.open,R.string.close);
        mToolbar = (Toolbar)findViewById(R.id.mTool);
        setSupportActionBar(mToolbar);

        drawerLayout1.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        im11= (ImageButton)findViewById(R.id.im1);
        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First.this,loginpage.class);
                startActivity(intent);
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item))

        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
