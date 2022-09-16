
package calculator;


class Expoente {

    static void potencia() {
        LerDados r  = new LerDados();
        r.lerValores();
        System.out.println("Potência: "+Math.pow(r.valor1, r.valor2) );
    }
    
}