import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        var numero = scanner.nextInt();
        
        for ( int i = 0; i < 10; i++){
            System.out.print(numero + "x" + i + "=");
            System.out.println(i * numero);
            }
        }
    }

 