package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gestion(View view){
        Intent i = new Intent(getBaseContext(),Gestion_act.class);
        startActivity(i);
    }
    public void listado(View view){
        Intent i = new Intent(getBaseContext(),Listado_act.class);
        startActivity(i);
    }

    public void armarPizza(View view){
        Intent i = new Intent(getBaseContext(),Arma_pizza_act.class);
        startActivity(i);
    }
}