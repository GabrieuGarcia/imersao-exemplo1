package br.com.tt.exerciciobanco.model;

import br.com.tt.exerciciobanco.enumeration.TipoDocumentoEnum;

public class CorrentistaPF extends Correntista{

    private TipoDocumentoEnum tipoDocumento;

    public CorrentistaPF(String nome, Conta conta, TipoDocumentoEnum tipoDocumentoEnum) {
        super(nome, conta);
        this.tipoDocumento = tipoDocumentoEnum;
    }

    public String obtemDescrição() {
        return String.format("%s,", super.obtemDescrição(), this.tipoDocumento);
    }

}
