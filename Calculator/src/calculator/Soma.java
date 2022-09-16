
package calculator;


class Soma {

    static void somar() {
        LerDados r = new LerDados();
        r.lerValores();
        System.out.println("Soma: "+(r.valor1 + r.valor2));
    }
    
    
}
