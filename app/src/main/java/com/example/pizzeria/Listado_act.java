package com.example.pizzeria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import Model.Pizza;

public class Listado_act extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Pizza> listaPizza = new ArrayList<Pizza>();
    Pizza pizzaSelected;

    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        inicializarBase();


        lista= findViewById(R.id.lv);


        //Método para obtener la posición del listView
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pizzaSelected = (Pizza) parent.getItemAtPosition(position);
            }
        });

        //Mostrar pizzas
        databaseReference.child("pizzeria").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot op: snapshot.getChildren()){
                    Pizza p = op.getValue(Pizza.class);
                    listaPizza.add(p);
                    ArrayAdapter adapt= new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1,listaPizza);
                    lista.setAdapter(adapt);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    //Método para eliminar de la database

    public void eliminarPizza(View view){
            Pizza p = new Pizza();
            p.setId(pizzaSelected.getId());
            databaseReference.child("pizzeria").child(p.getId()).removeValue();
        Toast.makeText(getBaseContext(),"Has eliminado una pizza",Toast.LENGTH_SHORT).show();
    }


    public void inicializarBase(){
        FirebaseApp.initializeApp(this);
        firebase=FirebaseDatabase.getInstance();
        databaseReference=firebase.getReference();
    }
}