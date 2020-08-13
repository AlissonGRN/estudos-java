package app;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);

        int caso = 0;
        System.out.println("Digite um número: ");
        caso = leitor.nextInt();

        switch (caso) {

            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("outro número");
                // não é nescessario o break

        }


    }

}
