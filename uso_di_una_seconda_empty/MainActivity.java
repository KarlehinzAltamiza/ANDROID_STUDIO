package com.example.uso_di_una_seconda_empty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inserisci;
    TextView titolo;
    Button reset;
    Button test;
    Button play;
    Intent  pagina2;
    TextView titolo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inserisci=findViewById(R.id.inserisci);
        titolo=findViewById(R.id.titolo);
        reset=findViewById(R.id.reset);
        test=findViewById(R.id.test);
        play=findViewById(R.id.play);
        reset.setOnClickListener(new View.OnClickListener() {   //con questa istruzione quando cliccano all'bottone, controllo l'azione che esegue
            @Override
            public void onClick(View v) {
                inserisci.setText(""); //serve per cancellare il testo
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fraseinserita=inserisci.getText().toString();
                Toast t=Toast.makeText(getApplicationContext(),fraseinserita,Toast.LENGTH_LONG);
                t.show();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fraseinserita=inserisci.getText().toString();
                pagina2= new Intent(getApplicationContext(),Seconda_Pagina.class);
                pagina2.putExtra("fraseinserita",fraseinserita);  //tra le virgolette gli do il nome dell'extra, dopo gli passo il valore che voglo passare
                startActivity(pagina2);
            }
        });
    }
}
