package com.satyam.cricketstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {
    String  txtName1, txtRole2, txtMatchTestBat3, txtMatchOdiBat4, txtMatchT20Bat5,
            txtMatchTestBowl6, txtMatchOdiBowl7, txtMatchT20Bowl8,txtRunsTest9,
            txt50sTest10, txt100sTest11, txtRunsOdi12, txt50sOdi13, txt100sOdi14,
            txtRunsT2015, txt50sT2016, txt100sT2017,txtWicketsTest18, txtEcoTest19,
            txtBestTest20, txtWicketsOdi21, txtEcoOdi22, txtBestOdi23, txtWicketsT2024, txtEcoT2025, txtBestT2026;;

    TextView txtName, txtRole, txtMatchTestBat, txtMatchOdiBat, txtMatchT20Bat,
            txtMatchTestBowl, txtMatchOdiBowl, txtMatchT20Bowl;
    TextView txtRunsTest, txt50sTest, txt100sTest, txtRunsOdi, txt50sOdi, txt100sOdi, txtRunsT20, txt50sT20, txt100sT20;

    TextView txtWicketsTest, txtEcoTest, txtBestTest, txtWicketsOdi, txtEcoOdi, txtBestOdi, txtWicketsT20, txtEcoT20, txtBestT20;
    ImageView playerImage;
    int imagevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        playerImage = findViewById(R.id.playerImage);
        txtName = findViewById(R.id.txtName);
        txtRole = findViewById(R.id.txtRole);
        txtMatchTestBat = findViewById(R.id.txtMatchTestBat);
        txtMatchOdiBat = findViewById(R.id.txtMatchOdiBat);
        txtMatchT20Bat = findViewById(R.id.txtMatchT20Bat);
        txtMatchTestBowl = findViewById(R.id.txtMatchTestBowl);
        txtMatchOdiBowl = findViewById(R.id.txtMatchOdiBowl);
        txtMatchT20Bowl = findViewById(R.id.txtMatchT20Bowl);

        txtRunsTest = findViewById(R.id.txtRunsTest);
        txt50sTest = findViewById(R.id.txt50sTest);
        txt100sTest = findViewById(R.id.txt100sTest);
        txtRunsOdi = findViewById(R.id.txtRunsOdi);
        txt50sOdi = findViewById(R.id.txt50sOdi);
        txt100sOdi = findViewById(R.id.txt100sOdi);
        txtRunsT20 = findViewById(R.id.txtRunsT20);
        txt50sT20 = findViewById(R.id.txt50sT20);
        txt100sT20 = findViewById(R.id.txt100sT20);

        txtWicketsTest = findViewById(R.id.txtWicketsTest);
        txtEcoTest = findViewById(R.id.txtEcoTest);
        txtBestTest = findViewById(R.id.txtBestTest);
        txtWicketsOdi = findViewById(R.id.txtWicketsOdi);
        txtEcoOdi = findViewById(R.id.txtEcoOdi);
        txtBestOdi = findViewById(R.id.txtBestOdi);
        txtWicketsT20 = findViewById(R.id.txtWicketsT20);
        txtEcoT20 = findViewById(R.id.txtEcoT20);
        txtBestT20 = findViewById(R.id.txtBestT20);

        Bundle bundle = getIntent().getExtras();
        imagevalue = bundle.getInt("image");
        playerImage.setImageResource(imagevalue);

        Intent intent=getIntent();
        txtName1=intent.getStringExtra("txtName");
        txtRole2=intent.getStringExtra("txtRole");
        txtMatchTestBat3=intent.getStringExtra("txtMatchTestBat");
        txtMatchOdiBat4=intent.getStringExtra("txtMatchOdiBat");
        txtMatchT20Bat5=intent.getStringExtra("txtMatchT20Bat");
        txtMatchTestBowl6=intent.getStringExtra("txtMatchTestBowl");
        txtMatchOdiBowl7=intent.getStringExtra("txtMatchOdiBowl");
        txtMatchT20Bowl8=intent.getStringExtra("txtMatchT20Bowl");
        txtRunsTest9=intent.getStringExtra("txtRunsTest");
        txt50sTest10=intent.getStringExtra("txt50sTest");
        txt100sTest11=intent.getStringExtra("txt100sTest");
        txtRunsOdi12=intent.getStringExtra("txtRunsOdi");
        txt50sOdi13=intent.getStringExtra("txt50sOdi");
        txt100sOdi14=intent.getStringExtra("txt100sOdi");
        txtRunsT2015=intent.getStringExtra("txtRunsT20");
        txt50sT2016=intent.getStringExtra("txt50sT20");
        txt100sT2017=intent.getStringExtra("txt100sT20");
        txtWicketsTest18=intent.getStringExtra("txtWicketsTest");
        txtEcoTest19=intent.getStringExtra("txtEcoTest");
        txtBestTest20=intent.getStringExtra("txtBestTest");
        txtWicketsOdi21=intent.getStringExtra("txtWicketsOdi");
        txtEcoOdi22=intent.getStringExtra("txtEcoOdi");
        txtBestOdi23=intent.getStringExtra("txtBestOdi");
        txtWicketsT2024=intent.getStringExtra("txtWicketsT20");
        txtEcoT2025=intent.getStringExtra("txtEcoT20");
        txtBestT2026=intent.getStringExtra("txtBestT20");

        txtName.setText(txtName1);
        txtRole.setText(txtRole2);
        txtMatchTestBat.setText(txtMatchTestBat3);
        txtMatchOdiBat.setText(txtMatchOdiBat4);
        txtMatchT20Bat.setText(txtMatchT20Bat5);
        txtMatchTestBowl.setText(txtMatchTestBowl6);
        txtMatchOdiBowl.setText(txtMatchOdiBowl7);
        txtMatchT20Bowl.setText(txtMatchT20Bowl8);

        txtRunsTest.setText(txtRunsTest9);
        txt50sTest.setText(txt50sTest10);
        txt100sTest.setText(txt100sTest11);
        txtRunsOdi.setText(txtRunsOdi12);
        txt50sOdi.setText(txt50sOdi13);
        txt100sOdi.setText(txt100sOdi14);
        txtRunsT20.setText(txtRunsT2015);
        txt50sT20.setText(txt50sT2016);
        txt100sT20.setText(txt100sT2017);

        txtWicketsTest.setText(txtWicketsTest18);
        txtEcoTest.setText(txtEcoTest19);
        txtBestTest.setText(txtBestTest20);
        txtWicketsOdi.setText(txtWicketsOdi21);
        txtEcoOdi.setText(txtEcoOdi22);
        txtBestOdi.setText(txtBestOdi23);
        txtWicketsT20.setText(txtWicketsT2024);
        txtEcoT20.setText(txtEcoT2025);
        txtBestT20.setText(txtBestT2026);

    }
}