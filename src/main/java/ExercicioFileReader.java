
import modelFileReader.UserFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExercicioFileReader {

    static List<UserFileReader> userFileReaders = new ArrayList<>();


    /**
     * Exercício: use a classe a seguir para fazer a leitura do arquivo.
     * 1 - Crie um HashSet com o nome e ordene.
     * 2 - Crie uma classe Pessoa com os campos id e nome. Crie uma pessoa para cada linha do arquivo.
     *     Ordene as pessoas pelo nome.
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(getInputFile());

        if (sc.hasNextLine()) {
            System.out.println("Header: " + sc.nextLine());
        }

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] partes = linha.split(",");

            String id = partes[0];
            String nome = partes[1];

            userFileReaders.add(new UserFileReader(Integer.parseInt(id), nome));

            System.out.println(id);
            System.out.println(nome);
        }

        Collections.sort(userFileReaders);
        System.out.println(userFileReaders);

        sc.close();
    }

    //Conteúdo de https://paste.ee/p/nSLSB
    // Coloque na pasta /resources/
    private static File getInputFile() {
        // Ou return new File(SuaClasse.class.getClassLoader().getResource("input_1.csv").toURI());
        return new File("src/main/resources/input_1.csv");
    }

}