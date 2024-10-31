import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    static public void main(String...args){
        //construir um livro de notas
        String s= "abc";
        int comprimento = s.length();
        
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        var meuLivro = new LivroDeNotas();
        meuLivro.setNomeDisciplina(disciplina1);
        //acionar o comportamento sobre ele
        meuLivro.exibirMensagem();
        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da Disciplina");
        var meuLivro2 = new LivroDeNotas();
        meuLivro2.setNomeDisciplina(disciplina2);
        meuLivro2.exibirMensagem();
    }
}