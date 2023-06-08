package com.example.provaav1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button avalia = (Button) findViewById(R.id.button);
        avalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editNome = (TextView) findViewById(R.id.editNome);
                TextView editData = (TextView) findViewById(R.id.editData);
                TextView editIdade = (TextView) findViewById(R.id.editIdade);
                TextView situacao = (TextView) findViewById(R.id.textResultado);
                RadioButton mais60 = (RadioButton) findViewById(R.id.radioMais60);
                RadioButton entre20a40 = (RadioButton) findViewById(R.id.radio20a40);
                RadioButton peso = (RadioButton) findViewById(R.id.radioPeso);
                RadioButton caminhar = (RadioButton) findViewById(R.id.radioCaminhar);
                CheckBox pai = (CheckBox) findViewById(R.id.checkPai);
                CheckBox mae = (CheckBox) findViewById(R.id.checkMae);
                CheckBox avo = (CheckBox) findViewById(R.id.checkAvo);
                CheckBox coracao = (CheckBox) findViewById(R.id.checkCoracao);
                CheckBox pressao = (CheckBox) findViewById(R.id.checkPressao);
                CheckBox musculo = (CheckBox) findViewById(R.id.checkMusculo);
                RadioButton dorPeito = (RadioButton) findViewById(R.id.radioDorPeito);
                RadioButton palpitacao = (RadioButton) findViewById(R.id.radioPalpitacao);
                RadioButton dorPerna = (RadioButton) findViewById(R.id.radioDorPerna);
                int idade = Integer.parseInt(editIdade.getText().toString());



                if((idade >45) && (mais60.isChecked()) && (peso.isChecked()) && ( (pai.isChecked()) || (mae.isChecked()) )
                && (coracao.isChecked()) && (pressao.isChecked()) && (( dorPeito.isChecked()) || palpitacao.isChecked())) {
                    situacao.setText("O paciente precisa com urgência de ser atendido por um\n" +
                            "cardiologista!");

                } else if ((idade < 45) && (entre20a40.isChecked()) && (caminhar.isChecked()) && (avo.isChecked())
                && (musculo.isChecked()) && (dorPerna.isChecked())) {
                    situacao.setText("O paciente não apresenta no momento nenhuma queixa\n" +
                            "que possa ser encaminhado a alguma especialidade médica!");

                } else {
                    situacao.setText("O paciente não apresenta os sitomas recorrentes da Anamnese, em caso de dúvida, vá a um médico.");
                }

            }
        });

    }
}