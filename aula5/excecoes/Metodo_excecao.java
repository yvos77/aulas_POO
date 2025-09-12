package aula5.excecoes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.NoSuchFileException;

public class Metodo_excecao {

    public static int dividir(int x, int y) {

        try {
            int res = x / y;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("App:dividir:ArithimeticException(Colocado por mim)");
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {

        
        try {
            int div = Metodo_excecao.dividir(100, 0);
            System.out.println("100 / 0 = " + div);
            Files.readString(Path.of("dados.txt"));
            

        } catch (NoSuchFileException e2) {

            System.out.println("Tratamento de Exceção NoSuchFileException");

        } catch (ArithmeticException e) {
        
            System.out.println("Operação inválida");
            System.out.println("Detalhes do erro: " + e);
            System.out.println("Mensagem: " + e.getLocalizedMessage());
            e.printStackTrace();

        } catch (IOException e3) {

            System.out.println("Tratamento de Exceção IO Exception");

        } finally {

            System.out.println("Finalizado!");

        }
    }
}
