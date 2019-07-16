package br.com.tt.exerciciobanco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Conta {

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private List<Movimento> movimentos;

    public Conta(Integer agencia, Integer numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0D;
        this.movimentos = new ArrayList<>();
    }

    public String toString() {
        return String.format("Agência: %s, Número: %s", this.agencia, this.numero);
    }

    public void adicionarMovimentos(Movimento movimento){

        int posicaoAtual = obtemPosicaoAtual();
        if(posicaoAtual == -1) {
            System.out.println("Não há mais movimentos disponíveis");
            return;
        }
        movimentos.set(posicaoAtual, movimento);
    }

    private int obtemPosicaoAtual() {
        for(int i = 0; i < movimentos.size()-1; i++) {
            Movimento movimento = movimentos.get(i);
            if(Objects.isNull(movimento)) {
                return i;
            }
        }
        return -1;
    }
}
