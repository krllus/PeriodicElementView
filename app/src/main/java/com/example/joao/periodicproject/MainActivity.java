package com.example.joao.periodicproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.joao.periodicproject.customview.WrapperPeriodicElement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WrapperPeriodicElement cooper = findViewById(R.id.element_cooper);
        cooper.setTextTop("29");

        cooper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, cooper.getTextBottom(), Toast.LENGTH_LONG).show();
            }
        });

        final WrapperPeriodicElement sodium = findViewById(R.id.element_sodium);
        sodium.setTextTop("11");
        sodium.setTextMiddle("Na");
        sodium.setTextBottom("Sodium");

        sodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, sodium.getTextBottom(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
