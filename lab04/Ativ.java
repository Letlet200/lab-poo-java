import java.util.Scanner;

//Faça um programa que calcula a quantidade de divisores de um número (incluindo 1 e o próprio número)
public class Divisores{
  public static void main(String[] args){
    var scanner = new Scanner (System.in);

    System.out.println("Digite um número para saber seus divisores: ");
    int num = scanner.nextInt();
    int divisores = 0;

    for ( int divisor = 1; num >= divisor;divisor++ ) {
          if ( num % divisor == 0){
            
            divisores++;
            
          }
          
        }
        System.out.println("O número " + num + " tem " + divisores + " divisores.");
        
    }
    

}
 