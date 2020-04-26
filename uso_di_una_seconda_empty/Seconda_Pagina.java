package com.example.uso_di_una_seconda_empty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Seconda_Pagina extends AppCompatActivity {
    Intent passaggiovalore;
    TextView titolo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda__pagina);
        passaggiovalore=getIntent();
        String fraseinserita=passaggiovalore.getStringExtra("fraseinserita");
        titolo2=findViewById(R.id.TITOLO_PAG_2);
        titolo2.setText("frase inserita:" +fraseinserita);
    }
}
