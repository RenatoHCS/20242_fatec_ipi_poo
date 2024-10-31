package sobrecarga_de_metodos;
public class TesteCalculadora {
    
    public static void main(String[] args) {
        var calc = new Calculadora();
        //var inferencia de tipo
        System.out.println(calc.somar (2,3));
        System.out.println(calc.somar(2.2,2));
        System.out.println(calc.somar(2,"1"));
        System.out.println(calc.somar("2",2));
    }
}
