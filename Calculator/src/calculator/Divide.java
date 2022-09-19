
package calculator;


class Divide {

 
    static void dividir() {
        LerDados r = new LerDados();
        r.lerValores("Insira um valor", "Insira outro valor");
        System.out.println("Divisão: "+ r.valor1/r.valor2) ;
    }
    
}
