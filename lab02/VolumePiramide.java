import java.util.Scanner;

public class VolumeP{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado da base da pirâmide:");
        double lBase = scanner.nextDouble();

        System.out.print("Digite a altura da pirâmide: ");
        double altura = scanner.nextDouble();

        double aBase = lBase * lBase;

        double volume =  (aBase * altura) / 3;

        System.out.println("O volume da pirâmide é: " + volume);

        scanner.close();

    }
}