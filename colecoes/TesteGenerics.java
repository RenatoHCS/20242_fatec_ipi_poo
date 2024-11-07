package colecoes;

public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico <Integer> inteiros = new VetorDinamico <Integer>(8);
        inteiros.adicionar(1);
        //inteiros.adicionar("string qualquer");
    
        VetorDinamico <String> strings = new VetorDinamico <String> (8);
        strings.adicionar("String qualquer");
        //strings.adicionar(1);
        var reais = new VetorDinamico<Double> (4); //var a partir do Java 10
        reais.adicionar(2.0);
        //reais.adicionar(new Musica("One"));
        VetorDinamico <Musica> musicas = new VetorDinamico <> (4); //Java 7
        musicas.adicionar(1);
        //var teste = new VetorDinamico<>(8); //gera object

    }
}
