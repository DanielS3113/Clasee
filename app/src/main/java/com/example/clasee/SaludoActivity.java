package com.example.clasee;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaludoActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState,@Nullable){
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.saludo);
        String saludo = getIntent().getExtras().getString("saludo");

        TextView text = (TextView) findViewById(R.id.textView);
    }

}
