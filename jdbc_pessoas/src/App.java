
import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
    var menu = 
    "1-Cadastrar\n2-Listar\n3-Atualizar\n4-Apagar\n0-Sair";
    int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu)
            );
            switch (op) {
                case 1:{
           
                var nome= JOptionPane.showInputDialog("nome?");
                var fone=JOptionPane.showInputDialog("Telefone?");
                var email = JOptionPane.showInputDialog("Email?");
                var p= new Pessoa(0, nome,fone,email);//construtor
                var dao = new PessoaDAO();
                dao.cadastrar(p);
                JOptionPane.showMessageDialog(null,"Cadastro Concluido");
                break;
            }
            case 2:{
                var pessoas = new PessoaDAO().Listar();
                JOptionPane.showMessageDialog(null, pessoas);
            
            break;
            }
            case 3:{

            
            break;
            }
            case 4:{
                var codigo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Código?"));
                var p = new Pessoa(codigo);
                var dao = new PessoaDAO();
                dao.apagar(p);
                JOptionPane.showMessageDialog(null,"Apagou");
                break;
            }
            case 0:{
                JOptionPane.showMessageDialog(null,"Puf");
            
            break;
            }
    
            default:
            break;
            }

        }while(op != 0);

    }
}
