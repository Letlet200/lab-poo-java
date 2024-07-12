import java.util.Scanner;

public class Conceitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();
            if (nota >=90) {
                System.out.println("Conceito A");
            } else if (nota >= 80) {
                System.out.println("Conceito B");
            } else if (nota >= 70) {
                System.out.println("Conceito C");
            } else if (nota >= 60) {
                System.out.println("Conceito D");
            } else if (nota >= 0) {
                System.out.println("Conceito E");
            }
    }
}
 