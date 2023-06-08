package com.example.persistencia;

public class Aluno {
    public Aluno(int _Matricula, String nomeAluno, String email, String telefone) {
        this._Matricula = _Matricula;
        NomeAluno = nomeAluno;
        Email = email;
        Telefone = telefone;
    }

    int _Matricula;
    String NomeAluno;
    String Email;
    String Telefone;

    public int get_Matricula() {
        return _Matricula;
    }

    public void set_Matricula(int _Matricula) {
        this._Matricula = _Matricula;
    }

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        NomeAluno = nomeAluno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
