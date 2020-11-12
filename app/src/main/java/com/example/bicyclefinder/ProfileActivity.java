package com.example.bicyclefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    public void ClickedDeleteLostBike(View view) {Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void ClickedDeleteFoundBike(View view) {Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void ClickedLogout(View view) {Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}