package com.cursoandroid.imc;

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

        Button calcular = (Button)  findViewById(R.id.button2);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView)  findViewById(R.id.editAltura);
                TextView resultado = (TextView)  findViewById(R.id.textResultado);
                TextView situacao = (TextView)  findViewById(R.id.textSituacao);
                float peso = Float.parseFloat(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                float imc;
                imc = peso / (altura * altura);

                if (imc < 18.5){
                    resultado.setText(""+imc);
                    situacao.setText("Abaixo do Peso!");
                } else {
                    if (imc>= 18.5 && imc <25) {
                        resultado.setText(""+imc);
                        situacao.setText("Peso ideal");
                    }else{
                        if (imc >= 25 && imc <30){
                            resultado.setText(""+imc);
                            situacao.setText("Sobrepeso");
                        }else{
                            if (imc>30 && imc<35){
                                resultado.setText(""+imc);
                                situacao.setText("Obesidade");
                            }else{
                                resultado.setText(""+imc);
                                situacao.setText("Obesidade extrema");
                            }
                        }
                    }
                }

            }
        });
    }
}