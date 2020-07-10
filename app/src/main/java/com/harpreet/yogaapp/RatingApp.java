package com.harpreet.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class RatingApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_app);

        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);

        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley) {

                    switch (smiley) {
                        case SmileRating.BAD:
                            Toast.makeText(RatingApp.this, "BAD", Toast.LENGTH_SHORT).show();
                            break;
                        case SmileRating.GOOD:
                            Toast.makeText(RatingApp.this, "Good", Toast.LENGTH_SHORT).show();
                            break;
                        case SmileRating.GREAT:
                            Toast.makeText(RatingApp.this, "Great", Toast.LENGTH_SHORT).show();
                            break;
                        case SmileRating.OKAY:
                            Toast.makeText(RatingApp.this, "Okay", Toast.LENGTH_SHORT).show();
                            break;
                        case SmileRating.TERRIBLE:
                            Toast.makeText(RatingApp.this, "Terrible", Toast.LENGTH_SHORT).show();
                            break;

                    }
                }
            });
            }



    }
