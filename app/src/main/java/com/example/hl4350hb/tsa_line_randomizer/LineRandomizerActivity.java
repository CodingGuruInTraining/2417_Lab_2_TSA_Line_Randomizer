package com.example.hl4350hb.tsa_line_randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class LineRandomizerActivity extends AppCompatActivity {

    private Button mTapHereButton;
    private ImageButton mRightArrow;
    private ImageButton mLeftArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_randomizer);

        mTapHereButton = (Button) findViewById(R.id.tap_here_button);
        mRightArrow = (ImageButton) findViewById(R.id.right_arrow);
        mLeftArrow = (ImageButton) findViewById(R.id.left_arrow);

        addEventListeners();
    }

    private void addEventListeners() {

        mTapHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomArrow();
            }
        });

        mRightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        mLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    private void showRandomArrow() {
        mTapHereButton.setVisibility(View.GONE);

        int random = new Random().nextInt(2);

        if (random == 0) {
            mRightArrow.setVisibility(View.VISIBLE);
        }
        else {
            mLeftArrow.setVisibility(View.VISIBLE);
        }
    }

    private void reset() {
        mRightArrow.setVisibility(View.GONE);
        mLeftArrow.setVisibility(View.GONE);

        mTapHereButton.setVisibility(View.VISIBLE);
    }
}
