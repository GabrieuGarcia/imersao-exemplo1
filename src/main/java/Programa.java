import br.com.tt.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.tt.exerciciobanco.view.Tela;
import br.com.tt.exerciciobanco.view.TelaCorrentista;
import br.com.tt.exerciciobanco.view.TelaMovimento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Tela tela;

        while (true) {
            System.out.println("========================================");
            System.out.println("SEJA BEM-VINDO!");
            System.out.println("========================================");
            System.out.println("Escolha: ");
            System.out.println("----------------------------------------");
            System.out.println("1 - Cadastrar novo correntista PF:");
            System.out.println("2 - Cadastrar novo correntista PJ:");
            System.out.println("3 - Cadastrar novo movimento:");
            System.out.println("4 - Sair");
            Integer opcao = pedirNumero();

            switch (opcao) {
                case 1:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.PF);
                    break;
                case 2:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.PJ);
                    break;
                case 3:
                    tela = new TelaMovimento();
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    continue;
            }
            tela.abrirTela();
        }
    }

    public static Integer pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Número inválido!");
            System.out.println("Digite corretamente: ");
            return pedirNumero();
        }
    }
}
