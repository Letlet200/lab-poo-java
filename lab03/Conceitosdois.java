import java.util.Scanner;

public class Conceitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o conceito: ");
        String conceito = scanner.next();

        switch (conceito) {
            case "A", "a"-> System.out.println("Equivale a nota 100");

        }
    }
}
 