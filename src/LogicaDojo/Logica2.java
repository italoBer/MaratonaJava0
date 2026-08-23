package LogicaDojo;

public class Logica2 {
    public static void main(String[] args) {

        float salario = 4700.00F;
        float result = 0F;
        String porcent = " ";

        if (salario > 4500) {
            result = (salario * 0.30F);
            porcent = "30%";
        } else {
            result = (salario * 0.15F);
            porcent = "30%";
        }

        System.out.println("Resultado é: " + porcent + " é de " + result);

    }

}
