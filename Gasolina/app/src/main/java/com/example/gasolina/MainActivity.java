package com.example.gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCalcular = (Button)  findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editGasolina = (TextView) findViewById(R.id.editGasolina);
                TextView editAlcool = (TextView) findViewById(R.id.editAlcool);
                TextView textResultado = (TextView) findViewById(R.id.textResultado);

                float gasolina = Float.parseFloat(editGasolina.getText().toString());
                float alcool = Float.parseFloat(editAlcool.getText().toString());
                double conta;

                conta = gasolina * 0.7 ;

                if (conta >= alcool){
                    textResultado.setText("O ideal para uma melhor economia,é abastecer com álcool");

                }else{
                    textResultado.setText( "O ideal para uma melhor economia,é abastecer com gasolina "  );

                }


            }

            });
    }
}