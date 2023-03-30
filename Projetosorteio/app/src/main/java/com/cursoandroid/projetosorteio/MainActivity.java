package com.cursoandroid.projetosorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

        public void sotearNumero(View view){
            TextView texto = findViewById(R.id.textResultaado);
            int numero = new Random().nextInt(11);
            texto.setText("Número: "+numero);

        }

}