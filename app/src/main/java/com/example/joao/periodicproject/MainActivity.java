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

        final WrapperPeriodicElement element = findViewById(R.id.element_1);
        element.setTextTop("15");

        element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, element.getTextBottom(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
