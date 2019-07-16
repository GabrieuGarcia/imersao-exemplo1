package br.com.tt.exerciciobanco.view;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public abstract class Tela {

   public abstract void abrirTela();

    public Integer pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        Integer retorno = null;

        while (Objects.isNull(retorno)) {
            try {
                retorno = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Input inválido: "+e.getMessage());
            }
        }
        return retorno;
    }

    public String pedirTexto() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Texto inválido!");
            System.out.println("Digite corretamente: ");
            return pedirTexto();
        }
    }

    public Double adicionarValor() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Número inválido!");
            System.out.println("Digite corretamente: ");
            return adicionarValor();
        }
    }
}
