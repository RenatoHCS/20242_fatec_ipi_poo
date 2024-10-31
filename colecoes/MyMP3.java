package colecoes;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class MyMP3 {
    public static void main(String[] args) {
        
        var musicas = new ArrayList<Musica>();
        //1 - Cadastrar uma música
        //2 - Visualizar a lista de músicas
        //3 - Remover música
        //4 - Sair
        int op;
        var menu = 
        "1 - Cadastrar música\n2-Listar músicas\n3-Remover música\n0-Sair";

        do {
            op = parseInt(showInputDialog(menu));
            switch (op) {
                case 1:{

                    var titulo = showInputDialog("Qual titulo?");
                    var musica = new Musica(titulo);
                    musicas.add(musica);
                    showMessageDialog(null,"Musica adicionada");
                    break;
                }
                case 2:{

                    if(!musicas.isEmpty()){
                        var sb = new StringBuilder(""); 
                        for (var m : musicas){
                            sb.append(m.getTitulo()).append("\n");
                        }
                        showMessageDialog(null, sb.toString());
                    }
                    
                    break;
                }
                case 3:{

                    var titulo = showInputDialog("Qual titulo");
                    var m = new Musica(titulo);
                    musicas.remove(m);
                    musicas.remove(new Musica(titulo));
                    
                    break;
                    
                }
                case 0:{

                    showMessageDialog(null, "DJA");
                    break;
                    
                }
                    default:{

                        break;
                    }
                    }



        } while (op != 0);
    }
    
}
