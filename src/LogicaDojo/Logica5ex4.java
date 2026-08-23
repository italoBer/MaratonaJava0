package LogicaDojo;

import java.util.Scanner;

public class Logica5ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String conta;

        System.out.println("Digite a conta q deseja: ");
        System.out.println("1 - Conta poupanca");
        System.out.println("2 - Conta Recorrente");
        System.out.println("3 - Conta Investimento");


        switch (sc.nextInt()) {
            case 1:
                System.out.println("0.05% de juros! ");
                break;
            case 2:
                System.out.println("0.02% de juros! ");
                break;
            case 3:
                System.out.println(" 0.1% de juros! ");
                break;
            default:
                System.out.println("Digite um numero valido! ");
        }




    }
}
