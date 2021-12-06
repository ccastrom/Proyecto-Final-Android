package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Model.Pizza;

public class Gestion_act extends AppCompatActivity {

    private EditText name,pre,loc;
    private Button btn;

    //Declarar datos para obtener instancia de la database
    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);
        inicializarBase();

        name =findViewById(R.id.nombre);
        pre =findViewById(R.id.precio);
        loc =findViewById(R.id.localizacion);
        btn=findViewById(R.id.btnAnadir);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //AÑADIR PIZZAS

                Pizza p = new Pizza();
                p.setId(UUID.randomUUID().toString());
                p.setNombre(name.getText().toString());
                p.setPrecio(pre.getText().toString());
                p.setLocalizacion(loc.getText().toString());
                databaseReference.child("pizzeria").child(p.getId()).setValue(p);
               Toast.makeText(getBaseContext(),"Has añadido una pizza",Toast.LENGTH_SHORT).show();
               clearForm();
            }
        });
    }
    //Método para obtener la database
    public void inicializarBase(){
        FirebaseApp.initializeApp(this);
        firebase=FirebaseDatabase.getInstance();
        databaseReference=firebase.getReference();
    }
    public void clearForm(){
        name.setText("");
        pre.setText("");
        loc.setText("");
    }
}