package com.shakhzod.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 = yellow, 1 = red
    int activePlayer = 0;

    //2 means unplayed and 9 elements mean 9 items
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if(gameState[tappedCounter] == 2){

            gameState[tappedCounter] = activePlayer;

        counter.setRotation(0);
        counter.setTranslationY(-1000f);

        if (activePlayer == 0) {
            counter.setImageResource(R.drawable.yellow);
            activePlayer = 1;
        } else {
            counter.setImageResource(R.drawable.red);
            activePlayer = 0;
        }
        counter.animate().translationYBy(1000f).rotation(360).setDuration(500);
        }
    }
}
