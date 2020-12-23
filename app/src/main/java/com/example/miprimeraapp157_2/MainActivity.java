package com.example.miprimeraapp157_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_prueba);
        Log.d("MainActivity", "onCreate");

        // ejemplo de Toast
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();

        Button button = findViewById(R.id.buttonPass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeIntent();
            }
        });

    }

    // Intent explicito
    private void makeIntent(){
        Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(mIntent);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
        Toast.makeText(this, "Chao", Toast.LENGTH_LONG).show();
    }
}