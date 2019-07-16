package br.com.tt.exerciciobanco.infra;

import br.com.tt.exerciciobanco.model.Correntista;

import java.util.ArrayList;
import java.util.List;

public class DadoSingleton {

    private int correntistaAtual;
    private List<Correntista> correntistas;
    private static DadoSingleton dadoSingleton;

    private DadoSingleton() {
        System.out.println("Fui inicializado..." + getClass().getName());

        correntistas = new ArrayList<>();
        correntistaAtual = 0;
    }

    public static DadoSingleton getInstance() {
        if(dadoSingleton == null) {
            dadoSingleton = new DadoSingleton();
        }
        return dadoSingleton;
    }

    public void adicionaCorrentista(Correntista correntista) {
        correntistas.set(correntistaAtual++, correntista);
    }

    public List<Correntista> getCorrentistas() {
        return correntistas;
    }
}
