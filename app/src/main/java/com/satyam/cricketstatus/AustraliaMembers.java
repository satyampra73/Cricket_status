package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AustraliaMembers extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia_members);
    }

    public void onSteve(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.stevensmith1);
        startActivity(intent);
    }

    public void onTravis(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.travishead2);
        startActivity(intent);
    }

    public void onWarner(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.davidwarner3);
        startActivity(intent);
    }

    public void onFinch(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.aaronfinch4);
        startActivity(intent);
    }

    public void onMaxwell(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.glennmaxwell5);
        startActivity(intent);
    }

    public void onStoinis(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.marcusstoinis6);
        startActivity(intent);
    }

    public void onAgar(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.ashtonagar7);
        startActivity(intent);
    }

    public void onWade(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.matthewwade8);
        startActivity(intent);
    }

    public void onRichardson(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.kanerichardson9);
        startActivity(intent);
    }

    public void onZampa(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.adamzampa10);
        startActivity(intent);
    }

    public void onFaulkner(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.jamesfaulkner11);
        startActivity(intent);
    }

    public void onStanlake(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.billystanlake12);
        startActivity(intent);
    }

    public void onSams(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.danielsams13);
        startActivity(intent);
    }

    public void onTimPain(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.timpaine14);
        startActivity(intent);
    }

    public void onMaddinson(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.nicmaddinson15);
        startActivity(intent);
    }

    public void onHenriques(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.moiseshenriques16);
        startActivity(intent);
    }

    public void onTye(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.andrewtye17);
        startActivity(intent);
    }

    public void onCoachLanger(View view) {  intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachjustinlanger);
        startActivity(intent);
    }

    public void onCoachTroy(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachtroycooley);
        startActivity(intent);
    }

    public void onCoachYoung(View view) {
        intent = new Intent(AustraliaMembers.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachmikeyoung);
        startActivity(intent);
    }
}