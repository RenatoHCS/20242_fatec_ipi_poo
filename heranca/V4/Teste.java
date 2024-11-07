package heranca.V4;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Teste {
    public static void main(String[] args) {
        
        var nome = showInputDialog("Qual nome?");
        var idade = parseInt(showInputDialog("Qual a idade"));
        var p = new Pessoa( nome, idade);
        var a = new Aluno("Pedro",19,123456);

        System.out.println(a.toString());
    }
}
