
package calculator;


class Subtrai {

    static void subtrair() {
        LerDados r = new LerDados();
        r.lerValores("Insira um valor", "Insira outro valor");
        System.out.println("Subtracção: "+(r.valor1-r.valor2)); 
    }
    
}
