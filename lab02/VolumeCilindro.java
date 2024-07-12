import java.util.Scanner;

public class VolumeCilindro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro:");
        double raio= scanner.nextDouble();

        System.out.println("DIgite a altura do cilindro:");
        double altura= scanner.nextDouble();

        double volume= 3.14 * raio * raio * altura;

        System.out.println("O volume do cilindro é:" + volume);
        scanner.close();
    }


}