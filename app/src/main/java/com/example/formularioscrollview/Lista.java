package com.example.formularioscrollview;

public class Lista {
    String nome,email,nascimento,cpf,telefone,celular;




    public Lista(String nome, String email, String nascimento,String  cpf, String telefone,String celular) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }





}
