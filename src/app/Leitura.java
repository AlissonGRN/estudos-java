package app;

import  java.util.Scanner;

public class Leitura {
    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in); // instanciando novo objeto scanner

        System.out.println("Digite seu nome ");
        String nome = leitor.nextLine(); // ler a proxima linha

        System.out.println("Digite sua idade");
        int idade = leitor.nextInt(); // ler o proximo valor inteiro digitado

//        System.out.println("Digite sua altura");
//        double altura = leitor.nextDouble(); // ler proximo double

        System.out.println("nome: " + nome + "\n" + "idade: " + idade);

    }
}
