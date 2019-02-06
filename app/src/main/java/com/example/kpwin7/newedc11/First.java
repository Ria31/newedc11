package com.example.kpwin7.newedc11;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        BottomNavigationView btmnv = (BottomNavigationView)findViewById(R.id.botmnav);
        btmnv.setOnNavigationItemSelectedListener(nvst);
    }

//    private First(View view)
//    {
//        Fragment selectedFragment1 = new home1();
//        getSupportFragmentManager().beginTransaction().replace(R.id.frame1,selectedFragment1).commit();
//    }

    private BottomNavigationView.OnNavigationItemSelectedListener nvst =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()){
                case R.id.h11:
                    selectedFragment = new home1();
                    break;
                case R.id.a11:
                    selectedFragment = new appointments1();
                    break;
                case R.id.e11:
                    selectedFragment = new event1();
                    break;
                case R.id.p11:
                    selectedFragment = new profile1();
                    break;
                default:
                    selectedFragment=new home1();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1,selectedFragment).commit();

            return true;
        }
    };

}
