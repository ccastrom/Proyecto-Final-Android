package com.example.pizzeria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import Model.Pizza;
import Model.PizzaPredeterminadas;

public class Arma_pizza_act extends AppCompatActivity {

    Spinner spnPizza, spnIngrediente;
    TextView resultado;
    PizzaPredeterminadas p = new PizzaPredeterminadas();
    int resultadoFinal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arma_pizza);
        spnPizza=findViewById(R.id.spinnerPizza);
        resultado=findViewById(R.id.txtResultado);
        spnIngrediente=findViewById(R.id.spinneringrediente);

        String[] listaPizzas = p.getPizzaPredeterminada() ;
        String[] listaIngredientes=p.getIngredientes();

        ArrayAdapter adapt= new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaPizzas);
        spnPizza.setAdapter(adapt);
        ArrayAdapter adapt2= new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaIngredientes);
        spnIngrediente.setAdapter(adapt2);




    }
    public void CalcularPrecio(View view){

        String opcionPizza = spnPizza.getSelectedItem().toString();
        String opcionIngrediente = spnIngrediente.getSelectedItem().toString();

        int precioPizza=0;
        int precioIngrediente=0;


        for(int i = 0; i < opcionPizza.length(); i++){
            if (opcionPizza.equals(p.getPizzaPredeterminada()[i])){
                precioPizza=p.getPrecioPredeterminado()[i];
                System.out.println("Precio Pizza: "+precioPizza);
                break;

            }

        }

        for(int i = 0; i < opcionIngrediente.length(); i++){
            if (opcionIngrediente.equals(p.getIngredientes()[i])){
                precioIngrediente=p.getPrecioIngrediente()[i];
                System.out.println("Precio ingrediente: "+precioIngrediente);
                break;

            }


        }
        resultadoFinal=p.precioFinal(precioPizza,precioIngrediente);
        resultado.setText(""+resultadoFinal);


    }





}