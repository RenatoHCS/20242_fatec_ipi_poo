import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    static public void main(String...args){
        //construir um livro de notas
        String s= "abc";
        int comprimento = s.size();
        
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        var meuLivro = new LivroDeNotas();
        meuLivro.nomeDisciplina = disciplina1;
        //acionar o comportamento sobre ele
        meuLivro.exibirMensagem();
        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da Disciplina");
        var meuLivro2 = new LivroDeNotas();
        meuLivro2.nomeDisciplina = disciplina2;
        meuLivro2.exibirMensagem();
    }
}