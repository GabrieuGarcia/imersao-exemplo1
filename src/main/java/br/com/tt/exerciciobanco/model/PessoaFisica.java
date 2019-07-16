package br.com.tt.exerciciobanco.model;

public abstract class PessoaFisica implements Pessoa{

    public abstract void calcularSalario();

    public String getNome(String nome) {
        return nome;
    }

}
