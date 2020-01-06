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

        Button aboutButton = findViewById(R.id.about_btn);
        Button myprofileButton = findViewById(R.id.myprofile_btn);
        TextView introText = findViewById(R.id.intro_txt);


        // Set onclick listenner

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutActivityIntent = new Intent(MainActivity.this, AboutActivity.class);
                //aboutActivityIntent.putExtra(AboutActivity.EXTRA_URL, "https://andela.com/alc/");
                aboutActivityIntent.getData();
                startActivity(aboutActivityIntent);
            }
        });

        myprofileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myprofileActivityIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(myprofileActivityIntent);
            }
        });


    }

}


