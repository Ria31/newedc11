package com.example.kpwin7.newedc11;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;

public class Rg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rg4);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        toolbar.setTitle("123");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void wcl(View view) {
        Intent i = new Intent(Rg4.this,wlcm.class);
        startActivity(i);
    }
}
