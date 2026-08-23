package LogicaDojo;

import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario = 5000.00F;
        double desconto1 = 0.30;
        double desconto2 = 0.15;
        double desconto3 = 0.05;

        double resultado1 =  (salario * desconto1);
        System.out.println(resultado1);

        double resultado2 = (salario * desconto2);
        System.out.println(resultado2);

        double resultado3 = (salario * desconto3);
        System.out.println(resultado3);
    }



}
