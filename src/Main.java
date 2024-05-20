import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();


        System.out.println("Digite um numero de CEP para consulta: ");
        var numeroCep = leitura.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(numeroCep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.gerarArquivo(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }


    }
}