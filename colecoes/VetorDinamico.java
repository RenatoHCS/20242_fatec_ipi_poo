package colecoes;

public class VetorDinamico {
    private int qtd;
    private int cap;
    private int [] elementos;

    public void adicionar (int e){
    elementos[qtd] = e;
    qtd++;
        

    }
    public VetorDinamico(int cap){

        if (cap >= 4){
            elementos = new int[cap];
            this.cap = cap;

        }else {
            elementos = new int[4];
            this.cap = 4;
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
