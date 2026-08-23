package LogicaDojo;

public class Logica3 {
    public static void main(String[] args) {
        int num = 49;


        if ((num % 2) == 0) {
            System.out.println("O número " + num + " é PAR.");
        System.out.println("Ficaria "+ num / 2 +" para cada um dos dois. Não sobraria nada. Logo, 0.");
        } else {
            System.out.println("O número " + num + " é IMPAR.");

        System.out.println("Ficaria " + num % 2);
        }


    }
}
