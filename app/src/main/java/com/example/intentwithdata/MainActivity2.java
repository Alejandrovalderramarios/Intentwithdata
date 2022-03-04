package com.example.intentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView et2;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et2= (TextView) findViewById(R.id.et2);
        String data = getIntent().getStringExtra("data");
        et2.setText("Hola"+data);
        

}
        //Metodo Regresar
    public void Regresar (View View){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}