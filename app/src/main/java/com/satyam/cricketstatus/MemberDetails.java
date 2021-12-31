package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MemberDetails extends AppCompatActivity {
    Intent intent;
    static String txtName, txtRole, txtMatchTestBat, txtMatchOdiBat, txtMatchT20Bat,
            txtMatchTestBowl, txtMatchOdiBowl, txtMatchT20Bowl;
    static String txtRunsTest,txt50sTest,txt100sTest,txtRunsOdi,txt50sOdi,txt100sOdi,txtRunsT20,txt50sT20,txt100sT20;
    static String txtWicketsTest,txtEcoTest,txtBestTest,txtWicketsOdi,txtEcoOdi,txtBestOdi,txtWicketsT20,txtEcoT20,txtBestT20;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);
    }

    public void onVirat(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.viratkohli);
        startActivity(intent);
    }

    public void onShikhar(View view) {
        commonDetails("Shikhar Dhawan","Batsman","34","145","68","34","145","68");
        battingDetails("2315","5","7","6105","33","17","1759","11","0");
        bowlingDetails("0","2.0","0/0","0","0","0/0","0","0","0/0");
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.shikhardhawan2);

        intent.putExtra("txtName",txtName);
        intent.putExtra("txtRole",txtRole);
        intent.putExtra("txtMatchTestBat",txtMatchTestBat);
        intent.putExtra("txtMatchOdiBat",txtMatchOdiBat);
        intent.putExtra("txtMatchT20Bat",txtMatchT20Bat);
        intent.putExtra("txtMatchTestBowl",txtMatchTestBowl);
        intent.putExtra("txtMatchOdiBowl",txtMatchOdiBowl);
        intent.putExtra("txtMatchT20Bowl",txtMatchT20Bowl);

        intent.putExtra("txtRunsTest",txtRunsTest);
        intent.putExtra("txt50sTest",txt50sTest);
        intent.putExtra("txt100sTest",txt100sTest);
        intent.putExtra("txtRunsOdi",txtRunsOdi);
        intent.putExtra("txt50sOdi",txt50sOdi);
        intent.putExtra("txt100sOdi",txt100sOdi);
        intent.putExtra("txtRunsT20",txtRunsT20);
        intent.putExtra("txt50sT20",txt50sT20);
        intent.putExtra("txt100sT20",txt100sT20);

        intent.putExtra("txtWicketsTest",txtWicketsTest);
        intent.putExtra("txtEcoTest",txtEcoTest);
        intent.putExtra("txtBestTest",txtBestTest);
        intent.putExtra("txtWicketsOdi",txtWicketsOdi);
        intent.putExtra("txtEcoOdi",txtEcoOdi);
        intent.putExtra("txtBestOdi",txtBestOdi);
        intent.putExtra("txtWicketsT20",txtWicketsT20);
        intent.putExtra("txtEcoT20",txtEcoT20);
        intent.putExtra("txtBestT20",txtBestT20);
        startActivity(intent);
    }

    public void onRohit(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.rohitsharma3);
        startActivity(intent);
    }

    public void onShreyas(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.shreyasiyer4);
        startActivity(intent);
    }

    public void onPant(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.rishabhpant5);
        startActivity(intent);
    }

    public void onJadeja(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.ravindrajadeja6);
        startActivity(intent);
    }

    public void onHardik(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.hardikpandya7);
        startActivity(intent);
    }

    public void onShami(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.mohammadshami8);
        startActivity(intent);
    }

    public void onChahal(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.yuzvendrachahal9);
        startActivity(intent);
    }

    public void onBhuvneshwar(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.bhuvneshwarkumar10);
        startActivity(intent);
    }

    public void onDeepak(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.deepakchahar11);
        startActivity(intent);
    }

    public void onPrithvi(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.prithvishaw12);
        startActivity(intent);
    }

    public void onNitish(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.nitishrana13);
        startActivity(intent);
    }

    public void onKlRahul(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.klrahul14);
        startActivity(intent);
    }

    public void onKuldeep(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.kuldeepyadav15);
        startActivity(intent);
    }

    public void onKrunal(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.krunalpandya16);
        startActivity(intent);
    }

    public void onShardul(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.shardulnarendrthakur17);
        startActivity(intent);
    }

    public void onCoachDravid(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.coachrahuldravid);
        startActivity(intent);
    }

    public void onCoachSridhar(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.coachshridhar);
        startActivity(intent);
    }

    public void onCoachBharat(View view) {
        intent = new Intent(MemberDetails.this, Statistics.class);
        intent.putExtra("image", R.drawable.coachbharatarun);
        startActivity(intent);
    }

    public static void commonDetails(String name,String role,String matchTestBat,String matchOdiBat,String matchT20Bat,
                                     String matchTestBowl,String matchOdiBowl,String matchT20Bowl){
        txtName=name;
        txtRole=role;
        txtMatchTestBat=matchTestBat;
        txtMatchOdiBat=matchOdiBat;
        txtMatchT20Bat=matchT20Bat;
        txtMatchTestBowl=matchTestBowl;
        txtMatchOdiBowl=matchOdiBowl;
        txtMatchT20Bowl=matchT20Bowl;

    }

    public static void battingDetails(String runsTest,String fiftysTest,String hundredsTest,String runsOdi,String fiftysOdi,
                                      String hundredsOdi,String runsT20,String fiftysT20,String hundredsT20){
        txtRunsTest=runsTest;
        txt50sTest=fiftysTest;
        txt100sTest=hundredsTest;
        txtRunsOdi=runsOdi;
        txt50sOdi=fiftysOdi;
        txt100sOdi=hundredsOdi;
        txtRunsT20=runsT20;
        txt50sT20=fiftysT20;
        txt100sT20=hundredsT20;

    }

    public static void bowlingDetails(String wicketsTest,String ecoTest,String bestTest,String wicketsOdi,String ecoOdi,String bestOdi,String wicketsT20,String ecoT20,String bestT20){
        txtWicketsTest=wicketsTest;
        txtEcoTest=ecoTest;
        txtBestTest=bestTest;
        txtWicketsOdi=wicketsOdi;
        txtEcoOdi=ecoOdi;
        txtBestOdi=bestOdi;
        txtWicketsT20=wicketsT20;
        txtEcoT20=ecoT20;
        txtBestT20=ecoT20;
    }


}