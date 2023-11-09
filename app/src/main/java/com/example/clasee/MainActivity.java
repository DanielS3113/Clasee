package com.example.clasee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button greetButton = (Button) findViewById(R.id.greet);

        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameText = (EditText) findViewById(R.id.entry);
                String nameEntered = nameText.getText().toString().trim();
                String saludo = "";

                RadioGroup greeting = (RadioGroup) findViewById(R.id.greeting);
                if(R.id.rdm == greeting.getCheckedRadioButtonId()){
                    saludo = saludo +" Sr.";
                }
                if(R.id.rdf == greeting.getCheckedRadioButtonId()){
                    saludo = saludo +" Sra.";
                }

                saludo = "Hola "+ nameEntered;
                TextView saludoTextView = (TextView) findViewById(R.id.greetings);
                saludoTextView.setText(saludo);

                Intent intent = new Intent(MainActivity.this, SaludoActivity);
                Intent.putExtra("saludo",saludo);
                startActivity(intent);
            }
        });
    }
}