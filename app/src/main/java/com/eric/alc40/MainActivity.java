package com.eric.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.about_btn).setOnClickListener(new handleButton());
    }

    public class handleButton implements  View.OnClickListener{
        public void onClick (View view){
            Intent aboutActivity = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(aboutActivity);
        }
    }


}
