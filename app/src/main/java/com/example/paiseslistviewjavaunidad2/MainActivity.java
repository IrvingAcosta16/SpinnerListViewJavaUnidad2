package com.example.paiseslistviewjavaunidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView spnPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPaises = findViewById(R.id.spnPaises);
        ArrayAdapter<String> Adaptador = new ArrayAdapter<String> (MainActivity.this, android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.paises));
        spnPaises.setAdapter(Adaptador);
        spnPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            //SE HACE LA CONSULTA DEL PAIS
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Seleccione el pais " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
}
