package app;

import java.util.Scanner;

// Você deverá construir uma calculadora, na qual são pedidos dois valores para o usuário digitar, e depois, aparecem as opções de operação: somar, subtrair, dividir ou tirar o modulo, lembrando que o primeiro numero é o primeiro das operações.

public class Calculadora {
    public static void main(String args[]){
       Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.println("Escolha uma operação: \n [+] - 1 \n [-] - 2 \n [x] - 3 \n [/] - 4 \n [%] - 5 ");
        System.out.print("Sua opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
