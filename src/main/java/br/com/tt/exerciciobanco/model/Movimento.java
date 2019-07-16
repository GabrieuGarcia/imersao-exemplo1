package br.com.tt.exerciciobanco.model;

import br.com.tt.exerciciobanco.enumeration.TipoMovimentacaoEnum;

public class Movimento {

    private TipoMovimentacaoEnum tipo;
    private Double valor;
    private String descricao;

    public Movimento(TipoMovimentacaoEnum tipo, Double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricaoCompleta() {
        return String.format("Tipo: %s, Descrição: %s, Valor: %s", this.tipo, this.descricao, this.valor);
    }
}
