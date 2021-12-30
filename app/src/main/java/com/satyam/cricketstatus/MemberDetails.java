package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MemberDetails extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);
    }

    public void onVirat(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.viratkohli);
        startActivity(intent);
    }

    public void onShikhar(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.shikhardhawan2);
        startActivity(intent);
    }

    public void onRohit(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.rohitsharma3);
        startActivity(intent);
    }

    public void onShreyas(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.shreyasiyer4);
        startActivity(intent);
    }

    public void onPant(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.rishabhpant5);
        startActivity(intent);
    }

    public void onJadeja(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.ravindrajadeja6);
        startActivity(intent);
    }

    public void onHardik(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.hardikpandya7);
        startActivity(intent);
    }

    public void onShami(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.mohammadshami8);
        startActivity(intent);
    }

    public void onChahal(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.yuzvendrachahal9);
        startActivity(intent);
    }

    public void onBhuvneshwar(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.bhuvneshwarkumar10);
        startActivity(intent);
    }

    public void onDeepak(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.deepakchahar11);
        startActivity(intent);
    }

    public void onPrithvi(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.prithvishaw12);
        startActivity(intent);
    }

    public void onNitish(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.nitishrana13);
        startActivity(intent);
    }

    public void onKlRahul(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.klrahul14);
        startActivity(intent);
    }

    public void onKuldeep(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.kuldeepyadav15);
        startActivity(intent);
    }

    public void onKrunal(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.krunalpandya16);
        startActivity(intent);
    }

    public void onShardul(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.shardulnarendrthakur17);
        startActivity(intent);
    }

    public void onCoachDravid(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachrahuldravid);
        startActivity(intent);
    }

    public void onCoachSridhar(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachshridhar);
        startActivity(intent);
    }

    public void onCoachBharat(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image",R.drawable.coachbharatarun);
        startActivity(intent);
    }


}