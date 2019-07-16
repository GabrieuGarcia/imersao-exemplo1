package br.com.tt.exerciciobanco.model;

public abstract class Correntista {

    private String nome;
    private Conta conta;

    public Correntista(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String obtemDescrição() {
        return String.format("Nome: %s, Conta: %s", this.nome, this.conta);
    }

    public Conta getConta() {
        return conta;
    }
}
