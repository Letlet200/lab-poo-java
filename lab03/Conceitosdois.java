import java.util.Scanner;

public class Conceitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o conceito: ");
        String conceito = scanner.next();

        switch (conceito) {
            case "A", "a"-> System.out.println("Equivale a nota 100");
            case "B", "b"-> System.out.println("Equivale a nota 90");
            case "C", "c"-> System.out.println("Equivale a nota 80");
            case "D", "d"-> System.out.println("Equivale a nota 70");
            case "E", "e"-> System.out.println("Equivale a nota 60");

        }
    }
}
 