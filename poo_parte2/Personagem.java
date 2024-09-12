

public class Personagem{

    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    void cacar(){
        if(energia >=2){
        System.out.printf(nome +" caçando\n");
        energia-=2;
    }else{
        System.out.printf(
            "%s sem energia para cacar"
            ,nome
        );
    }
    
    fome = fome == 10 ? fome : fome + 1;
    //sono = sono +1 > 10 ? sono : sono + 1;
    sono = sono == 10 ? sono : sono + 1;
    }

    void comer(){
        
        System.out.printf(nome +" comendo\n");
        if(fome >=1){
            energia = Math.min(energia + 1, 10);
            //energia = energia == 10 ? energia : energia + 1;
            fome--;
        }else{
            System.out.println(nome + " sem fome");
        }
        
    }
    void dormir(){
        System.out.printf(nome+ " dormindo");
        if (sono >= 1){
            energia = Math.min(energia + 1 , 10);
        //energia = energia == 10 ? energia : energia +1;
            sono--;
    }else{
        System.out.println(nome +" sem sono");
    }
        
    }


}


