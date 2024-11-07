package heranca.V4;
//construtor Pessoa
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        System.out.println("Construindo uma pessoa...");
    
        this.nome = nome;
        this.idade = idade;
    }
        public String getNome() {
            return nome;
        }
        public int getIdade() {
            return idade;
        }
        
        @Override
        public String toString(){
            return "Nome : " + nome + ", Idade: " + idade;
        }
}
