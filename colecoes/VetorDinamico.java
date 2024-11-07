package colecoes;

public class VetorDinamico {
    private int qtde;
    private int cap;
    private T[] elementos;
    

    public void adicionar (int e){
    elementos[qtde] = e;
    qtd++;
        

    }
    public VetorDinamico(int cap){

        if (cap >= 4){
            elementos = (T[])new Object[cap];
            this.cap = cap;

        }else {
            elementos = (T[])new Object[4];
            this.cap = 4;
        }
        this.qtde =0;
    
    }

    public void remover(){
if (!estaVazio()){
    qtde--;
    elementos[qtde] = null;
}
if (estaUmQuartoCheio){

}


    }
public String toString(){
    //qtd:2; cap:4;
    var sb = new StringBuilder("");
    sb.append("qtd:").append(qtd).append(", cap:").append(cap).append("\n");
    for (var i = 0; i < qtd ; i++){
        sb.append(elementos[i]).append(" ");
    }
    return sb.toString();
    

}
}
