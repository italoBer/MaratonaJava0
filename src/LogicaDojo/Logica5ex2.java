package LogicaDojo;

public class Logica5ex2 {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 18;

        if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamente Obrigatório.");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar? ");
        } else if (sexo == 'M' || sexo == 'F' && idade < 18) {
            System.out.println("Alistamento não permitido.");
        } else {
            System.out.println("Valor invalido");
        }



    }
}
