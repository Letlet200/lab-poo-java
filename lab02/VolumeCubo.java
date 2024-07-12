import java.util.Scanner;

public class VolumeCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do cubo: ");
        double lado = scanner.nextDouble();

        double volume = Math.pow(lado, 3);

        System.out.println("O volume do cubo com lado " + lado + " é: " + volume);

        scanner.close();
    }
}