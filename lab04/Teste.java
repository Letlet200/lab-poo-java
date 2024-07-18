import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        var numero = scanner.nextInt();
        var contador = 1;
        
        while (contador < 10){
            System.out.println(numero + "x" + contador + "=" + numero * contador);
            contador += 1;
            
        }
    }
}
 