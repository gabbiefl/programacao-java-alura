import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        Scanner leitura = new Scanner(System.in);

        System.out.println("=== Calculadora de Médias ===");
        System.out.println("Digite sua primeira nota: ");
        double notaUm = leitura.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double notaDois = leitura.nextDouble();

        double media = (notaUm + notaDois) / 2;
        System.out.println("Sua média é igual a: " + media);
    }

}
