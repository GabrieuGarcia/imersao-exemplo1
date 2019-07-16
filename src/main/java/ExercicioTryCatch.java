import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.CharacterCodingException;

public class ExercicioTryCatch {

    public static void main(String args[]) {

        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Resultado = " + c);
        } catch (NumberFormatException e) {
            System.out.println("numero nao divisivel por 0");
        }


        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Valor nulo");
        }

        try {
            String a = "Imersao Java";
            char c = a.charAt(29);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caracter nao encontrado!");
        }

        try {
            File file = new File("E://arquivo.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }

        try {
            int num = Integer.parseInt("zero");
            System.out.println(num);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
