import java.util.Scanner;

public class Jogo {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número:");
        
        double aleatorio = Math.random();

        do {
            System.out.println("Seu palpite:");
            int num = scanner.nextInt();

             if (num < aleatorio){
                System.out.println("O número dado é menor que o valor gerado");
                } 
                else if (num == aleatorio) {
                    System.out.println("Vôce acertou");
                }
                 
                } while (true);
            }
        
        }

        


 