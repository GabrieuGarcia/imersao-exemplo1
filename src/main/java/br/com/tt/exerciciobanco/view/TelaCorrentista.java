package br.com.tt.exerciciobanco.view;

import br.com.tt.exerciciobanco.enumeration.TipoDocumentoEnum;
import br.com.tt.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.tt.exerciciobanco.infra.DadoSingleton;
import br.com.tt.exerciciobanco.model.Conta;

import br.com.tt.exerciciobanco.model.CorrentistaPF;
import br.com.tt.exerciciobanco.model.CorrentistaPJ;

import java.util.InputMismatchException;

public class TelaCorrentista extends Tela {

    private TipoTelaEnum tipoTela;

    public void abrirTela() {

        System.out.println("1 - Digite o seu nome: ");
        String nome = pedirTexto();

        System.out.println("2 - Digite o número da sua conta:");
        Integer numero = pedirNumero();

        System.out.println("3 - Digite o número da sua agência:");
        Integer agencia = pedirNumero();

        Conta conta = new Conta(agencia, numero);


        if(TipoTelaEnum.PF.equals(tipoTela)) {

            try {
                System.out.println("4 - Digite o tipo de documento:");
                System.out.println(TipoDocumentoEnum.getValues());
                TipoDocumentoEnum tipoDoc = TipoDocumentoEnum.valueOf(pedirTexto());
                CorrentistaPF correntistaPF = new CorrentistaPF(nome, conta, tipoDoc);
                System.out.println(correntistaPF.obtemDescrição());
                DadoSingleton.getInstance().adicionaCorrentista(correntistaPF);

            } catch (InputMismatchException e) {
                for (TipoDocumentoEnum tipoDoc : TipoDocumentoEnum.values()) {
                    System.out.println("Errado digite : " + tipoDoc);
                }
            }

        } else if(TipoTelaEnum.PJ.equals(tipoTela)) {
            CorrentistaPJ correntistaPJ = new CorrentistaPJ(nome, conta);
            System.out.println(correntistaPJ.obtemDescrição());
            DadoSingleton.getInstance().adicionaCorrentista(correntistaPJ);
        }
    }
    public void setTipoTela(TipoTelaEnum tipoTela) {
        this.tipoTela = tipoTela;
    }
}
