
package calculator;


class Soma {

    static void somar() {
        LerDados r = new LerDados();
        r.lerValores("Insira um valor", "Insira outro valor");
        System.out.println("Soma: "+(r.valor1 + r.valor2));
    }
    
    
}
