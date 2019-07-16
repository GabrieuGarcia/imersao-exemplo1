package br.com.tt.exerciciobanco.view;

import br.com.tt.exerciciobanco.enumeration.TipoMovimentacaoEnum;
import br.com.tt.exerciciobanco.infra.DadoSingleton;
import br.com.tt.exerciciobanco.model.Correntista;
import br.com.tt.exerciciobanco.model.Movimento;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TelaMovimento extends Tela{

    private TipoMovimentacaoEnum tipoMovimentacaoEnum;

    public void abrirTela() {

        System.out.println("1 - Digite o Correntista");
        Correntista correntista = pedirCorrentista();

        System.out.println("2 - Digite o tipo de movimentação");
        System.out.println("---------------------------------");
        System.out.println("1 - DEBITO");
        System.out.println("2 - CREDITO");
        System.out.println("3 - SAQUE");
        System.out.println("4 - DEPOSITO");
        Integer opcao = pedirNumero();

        switch (opcao) {
            case 1:
                this.setTipoMovimentacaoEnum(TipoMovimentacaoEnum.DEBITO);
                break;
            case  2:
                this.setTipoMovimentacaoEnum(TipoMovimentacaoEnum.CREDITO);
                break;
            case 3:
                this.setTipoMovimentacaoEnum(TipoMovimentacaoEnum.SAQUE);
                break;
            case 4:
                this.setTipoMovimentacaoEnum(TipoMovimentacaoEnum.DEPOSITO);
                break;
        }

        System.out.println("3 - Digite a descrição da ");
        String descricao = pedirTexto();

        System.out.println("4 - Digite o valor da transação");
        Double valor = adicionarValor();

        Movimento movimento = new Movimento(tipoMovimentacaoEnum, valor, descricao);
        System.out.println(movimento.getDescricaoCompleta());

        correntista.getConta().adicionarMovimentos(movimento);
    }

    public Correntista pedirCorrentista() {
        List<Correntista> correntistas = DadoSingleton.getInstance().getCorrentistas();
        int i = 0;
        for(Correntista correntista : correntistas) {
            if (Objects.nonNull(correntista)) {
                System.out.println(i + " -> " + correntista.obtemDescrição());
            }
            i++;
        }

        int correntistaEscolhido = pedirNumero();
        return correntistas.get(correntistaEscolhido);
    }

    public void setTipoMovimentacaoEnum(TipoMovimentacaoEnum tipoMovimentacaoEnum) {
        this.tipoMovimentacaoEnum = tipoMovimentacaoEnum;
    }
}
