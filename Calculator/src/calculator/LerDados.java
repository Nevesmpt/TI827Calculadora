
package calculator;


public class LerDados {
    public float valor1, valor2;
    
    public void lerValores(String s1, String s2){
        System.out.println(s1);
        valor1 = Calculator.ler.nextFloat();
        System.out.println(s2);
        valor2 = Calculator.ler.nextFloat();
    }
            
    
    
}
