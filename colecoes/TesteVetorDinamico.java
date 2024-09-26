package colecoes;
import java.util.Random;
public class TesteVetorDinamico{

    public static void main(String[]args)throws Exception{

        var vetor = new VetorDinamico(8);
        var gerador = new Random();


        while(true){
            var valor = gerador.nextInt(10) + 1;
            vetor.adicionar(valor);
            
            System.out.println(vetor);
            System.out.println("-------------");

            Thread.sleep(5000);
        }
    }
}