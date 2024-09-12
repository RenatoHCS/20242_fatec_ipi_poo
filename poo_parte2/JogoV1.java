
public class JogoV1 {
    public static void main(String[] args) {
        //construir um objeto Personagem
        var  boneco = new Personagem();
        //atribuir um nome a ele
        boneco.nome = "Hrabet";
        //colocar o psergonagem para caçar
        boneco.cacar();
        //colocar o personagem para comer
        boneco.comer();
        //colocar  o personagem para dormir
        boneco.dormir();
    }
}
