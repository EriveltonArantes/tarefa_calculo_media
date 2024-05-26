import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int numeroDeNotas = 4;

        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.println("Digite a nota " + i + ":");
            soma += scanner.nextDouble();
        }

        double media = soma / numeroDeNotas;
        System.out.println("A média é: " + media);
    }
}
