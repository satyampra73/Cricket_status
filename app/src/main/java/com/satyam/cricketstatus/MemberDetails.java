package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MemberDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);
    }

    public void onVirat(View view) {
        Intent intent=new Intent(MemberDetails.this,Statistics.class);
        startActivity(intent);
    }
}