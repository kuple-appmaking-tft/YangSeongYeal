package com.example.kupleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MakingpageActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.making_gaesipan);
        findViewById(R.id.making_back).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Integer id=view.getId();
        switch (id){
            case R.id.making_back :
                    startActivity(new Intent(this,MainActivity.class));
                    break;
        }
    }
}
