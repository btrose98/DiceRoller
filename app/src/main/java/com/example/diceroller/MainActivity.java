package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton  oneDie, twoDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneDie = (ImageButton) findViewById(R.id.oneDie);
        twoDice = (ImageButton) findViewById(R.id.twoDice);

        oneDie.setOnClickListener(this);
        twoDice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.oneDie:
                openRollOneDie();
                break;
            case R.id.twoDice:
                openRollTwoDice();
                break;
        }
    }

    public void openRollOneDie(){
        Intent intent = new Intent(this, rollOneDie.class);
        startActivity(intent);
    }

    public void openRollTwoDice(){
        Intent intent = new Intent(this, rollTwoDice.class);
        startActivity(intent);
    }

}
