package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class rollTwoDice extends AppCompatActivity implements View.OnClickListener {

    private Button role;
    private ImageView imageView1, imageView2;
    private static Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_two_dice);

        role = (Button) findViewById(R.id.role);
        imageView1 = (ImageView) findViewById(R.id.rollDie1);
        imageView2 = (ImageView) findViewById(R.id.rollDie2);
        role.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        int dieOneResult = Result();
        int dieTwoResult = Result();
        imageView1.setImageResource(dieOneResult);
        imageView2.setImageResource(dieTwoResult);
    }

    public int Result(){
        int value = randomDiceValue();
        int result = getResources().getIdentifier("die_" + value, "drawable", "com.example.diceroller");
        return result;
    }

    public static int randomDiceValue(){
        return RANDOM.nextInt(6) + 1;
    }
}
