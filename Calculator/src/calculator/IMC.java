
package calculator;


class IMC {

    static void calculaIMC() {
        LerDados r = new LerDados();
        r.lerValores();
        System.out.println("IMC: "+((r.valor1)/(r.valor2)*(r.valor2))); 
        
    }
    
}
