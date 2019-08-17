package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class rollOneDie extends AppCompatActivity implements View.OnClickListener{

    private Button role;
    private ImageView imageView;
    private static Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_one_die);

        role = (Button) findViewById(R.id.role);
        imageView = (ImageView) findViewById(R.id.rollDieOne);

        role.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int value = randomDiceValue();
        int dieResult = getResources().getIdentifier("die_" + value, "drawable", "com.example.diceroller");

        imageView.setImageResource(dieResult);
    }

    public static int randomDiceValue(){
        return RANDOM.nextInt(6) + 1;
    }
}
