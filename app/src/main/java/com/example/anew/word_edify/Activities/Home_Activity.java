package com.example.anew.word_edify.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anew.word_edify.R;

public class Home_Activity extends AppCompatActivity {

    private Button buttonPlay;
    private Button buttonHowToPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonPlay=(Button)findViewById(R.id.playBtn);
        buttonHowToPlay=(Button)findViewById(R.id.HowplayBtn);
        // play button
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGameBoard=new Intent(Home_Activity.this,Gameboard_Activity.class);
                Home_Activity.this.startActivity(goToGameBoard);
            }
        });



        //How to play button
        buttonHowToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGameBoard=new Intent(Home_Activity.this,PlaHow_Activity.class);
                Home_Activity.this.startActivity(goToGameBoard);
            }
        });
    }
}
