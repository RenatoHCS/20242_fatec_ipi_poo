import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {
    private int codigo;
    private String nome,fone,email;

    public Pessoa (int codigo){
        this.codigo = codigo;}

    public void setNome(String nome){
        this.nome = nome;
}

    @Override
    public String toString(){
        return String.format("nome: %s, fone: %s, email: %s",nome,fone,email);

    }
}