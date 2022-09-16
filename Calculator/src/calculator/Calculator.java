/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author mneves
 */
public class Calculator {
    public static Scanner ler = new Scanner(System.in);
   
    public static void main(String[] args) {
        char op;
        do{
            System.out.println("--- MENU CALCULADORA ---");
            System.out.println(" + -> Soma");
            System.out.println(" - -> Subtracção");
            System.out.println(" * -> Multiplicação");
            System.out.println(" / -> Divisão");
            System.out.println(" e -> Expoente");
            System.out.println(" s -> Sair");
            System.out.println("Seleccione o operador da operação pretendida");
            op = ler.next().charAt(0);
            switch(op){
                case 's':
                case 'S': break;         
                case '+': Soma.somar();break;
                case '-': Subtrai.subtrair();break;
                case '*': Multiplica.multiplicar();break;
                case '/': Divide.dividir();break;
                case 'e':
                case 'E': Expoente.potencia();break;
                default: System.out.println("Operador incorrecto");
               
            }
        }while(op!='s' && op!='S');
    }
    
}
