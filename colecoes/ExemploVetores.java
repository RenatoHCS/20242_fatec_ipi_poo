package colecoes;
import java.util.Random;

public class ExemploVetores{
    static int b;
    String j;


public static void main(String[]args){
    
    int notas[] = new int[4];
    var gerador = new Random();
    System.out.println(notas[0]);
    System.out.println();
   // preencher o vetor com valores de interesse
    // notas[0] = 10;
    // //System.out.println(b);
    // notas[1] = 7;
    // notas[2] = 4;
    for (int i = 0 ; i<notas.length;i++){
        notas [i] = gerador.nextInt(11);
    }
    int i =0;
    while (i< notas.length){
System.out.println(notas[i]);
        i++;
    }
    int total = 0;
    for (int nota: notas){
       total += nota;
        System.out.println(notas.length == 0 ? "sem notas" : "A média das notas é: " + (double) total / notas.length);
    }
}
}