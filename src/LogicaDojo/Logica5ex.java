package LogicaDojo;

import java.util.Scanner;

public class Logica5ex {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String user =  teclado.next();

        if (user.equalsIgnoreCase(null) || user.equals("") || user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido.");
        } else  {
            System.out.println(user +" cadastrado com sucesso.");
        }


    }
}
