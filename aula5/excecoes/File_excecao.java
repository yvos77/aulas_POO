package aula5.excecoes;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.NoSuchFileException;

public class File_excecao {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Digite um número: ");
        // int x = sc.nextInt();
        // sc.close();

        try {

            File f = new File("dados.txt");
            if (!f.exists()) {
                throw new NoSuchFileException("O arquivo 'dados.txt' não existe!");
            }
            Files.readString(Path.of(f.toURI()));


        } //catch (NoSuchFileException e2) {

            //System.out.println("Tratamento de Exceção NoSuchFileException");

        //} 
        catch (ArithmeticException e) {
        
            System.out.println("Operação inválida");
            System.out.println("Detalhes do erro: " + e);
            System.out.println("Mensagem: " + e.getLocalizedMessage());
            e.printStackTrace();

        } 
        //catch (IOException e3) {

           // System.out.println("Tratamento de Exceção IO Exception");

        //} 
        finally {

            System.out.println("Finalizado!");

        }
    }
}
