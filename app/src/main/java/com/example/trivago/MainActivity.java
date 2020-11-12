package com.example.trivago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton floating = findViewById(R.id.aled_button);
        ItemFragment fragment = ItemFragment.newInstance(1);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               fragment.updateAdapter();

            }
        });


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commitNow();
    }
}