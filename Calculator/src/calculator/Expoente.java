
package calculator;


class Expoente {

    static void potencia() {
        LerDados r  = new LerDados();
        r.lerValores("Insira o valor da base", "Insira o valor do expoente" );
        System.out.println("Potência: "+Math.pow(r.valor1, r.valor2) );
    }
    
}