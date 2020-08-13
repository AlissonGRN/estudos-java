package app;

public class EstruturasCondicionais {
    public static void main(String args[]){
/*        int num1 = 50;
        int num2 = 25;

        if (num1 > num2) {
            System.out.println(num1 > num2);
        } else if(num1 < num2) {
            System.out.println(num1 < num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }*/

        // Operador ternario

        int num1 = 100;
        int num2 = 50;
        int numMaior;

        numMaior = (num1 > num2 ? num1 : num2);
        System.out.println(numMaior);

    }
}
