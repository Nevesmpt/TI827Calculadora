

package calculator;


class Multiplica {

    static void multiplicar() {
        LerDados r = new LerDados();
        r.lerValores();
        System.out.println("Multiplicação: "+r.valor1*r.valor2);
    }
    
}
