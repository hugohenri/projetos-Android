package com.example.persistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.db = BancodeDados.Sharedinstance(this);

        Button btAluno = (Button) findViewById(R.id.btnAdicionarPessoa);
        String entmatAluno = (EditText) findViewById(R.id.matAluno);
        String entNome = (EditText) findViewById(R.id.nomeAluno);
        String entEmail = (EditText) findViewById(R.id.Email);
        String entCelular = (EditText) findViewById(R.id.TelefoneAluno);

        btAluno.setOnClickListener(new View.OnClickListener() {     //DENTRO DO ONCREATE
            @Override
            public void onClick(View v) {

                CadAluno(v);                    //inserir método criado

            }
        });
    }
    public void CadAluno(View view){                  //metodo criado       //FORA DO ONCREATE

        Aluno  aluno = new Aluno();
        aluno.setEntMatAluno(entMataluno.getText().toString());
        aluno.setEntNomeAluno(entNomeAluno.getText().toString());
        aluno.setEntEmail(entEmail.getText().toString());
        aluno.setEntTelefone(entTelefone.getText().toString());

        db.insertAluno(aluno);          //metodo criado no banco


    }
    @Override
    public void onCreate(SQLiteDatabase db) {



    }
        public void insertAluno(Aluno aluno){

            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();

            values.put("_Matricula", aluno.get_Matricula());
            values.put("NomeAluno", aluno.getNomeAluno);
            values.put("Email", aluno.getEmail);
            values.put("Telefone", aluno.getTelefone);

            db.insert("TbAluno", "", values);

            db.close();


        }

}