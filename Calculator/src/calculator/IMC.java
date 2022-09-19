
package calculator;

//optimizar, tirar de "&&" para a frente - se entra num if, já nao entra noutro
class IMC {

    static void calculaIMC() {
        LerDados r = new LerDados();
        r.lerValores("Insira o peso em kgs", "Insira a altura em metros");
        float IMC1 = ((r.valor1)/(r.valor2*r.valor2));        
        System.out.println("IMC: "+IMC1);
        
        if (IMC1 < 18.5)
            System.out.println(" Abaixo do Peso");
        else if (IMC1 >= 18.5 && IMC1 < 25)
            System.out.println(" Peso Normal");
        else if (IMC1 >= 25 && IMC1 < 30)
            System.out.println(" Sobrepeso");
        else if (IMC1 >= 30 && IMC1 < 35)
            System.out.println(" Obesidade Grau I");
        else if (IMC1 >= 35 && IMC1 < 40)
            System.out.println(" Obesidade Grau II");
        else
            System.out.println(" Obesidade Mórbida");
            
        
    }
    
}
