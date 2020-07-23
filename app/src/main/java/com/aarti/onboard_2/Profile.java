package com.aarti.onboard_2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView bg = findViewById(R.id.bg);

        Glide.with(this)
                .load(R.drawable.asset)
                .into(bg);
    }
}
