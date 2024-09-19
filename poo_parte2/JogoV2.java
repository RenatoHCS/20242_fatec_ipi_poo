import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Começando..");
        var bonecudo = new Personagem();
        var soneca = new Personagem(2,4,10);
        var fominha = new Personagem(6,10,2);
        bonecudo.nome = "H";
        soneca.nome = "Pooh";
       fominha.nome = "Scooby";
       var gerador = new Random();
       
        while (true){
            

            
            switch (gerador.nextInt(3)+1){
                case 1:
                bonecudo.cacar();
                break;
                case 2:
                bonecudo.comer();
                break;
                case 3:
                bonecudo.dormir();
                break;
                }
                System.out.println(bonecudo);
            
                System.out.println("----------------");
                switch (gerador.nextInt(3)+1){
                    case 1:
                    soneca.cacar();
                    break;
                    case 2:
                    soneca.comer();
                    break;
                    case 3:
                    soneca.dormir();
                    break;
                }
            System.out.println(soneca);
                System.out.println("----------------");
                switch (gerador.nextInt(3)+1){
                    case 1:
                    fominha.cacar();
                    break;
                    case 2:
                    fominha.comer();
                    break;
                    case 3:
                    fominha.dormir();
                    break;
                }
                System.out.println(fominha);
                System.out.println("=================");
                Thread.sleep(6000);
            }
            
        }
    }

        

    
