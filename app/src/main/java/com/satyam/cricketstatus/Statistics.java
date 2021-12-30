package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Statistics extends AppCompatActivity {
    ImageView playerImage;
    int imagevalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        playerImage=findViewById(R.id.playerImage);
        Bundle bundle = getIntent().getExtras();
        imagevalue = bundle.getInt("image");
        playerImage.setImageResource(imagevalue);

    }
}