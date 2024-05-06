import java.util.Scanner;

public class Diagnostic {
    public static void main(String[] args) {
        Imc imc = new Imc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("peso: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        imc.calcularImc(peso, altura);
    }
}
