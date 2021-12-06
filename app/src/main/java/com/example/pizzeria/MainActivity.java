package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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


    public void Facebook(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }

    public void Twitter(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.twitter.com/"));
        startActivity(i);
    }

    public void Youtube(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/"));
        startActivity(i);
    }
    public void Instagram(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.instagram.com/"));
        startActivity(i);
    }
}