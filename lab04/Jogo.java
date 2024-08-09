import java.util.Scanner;

public class Jogo {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número:");
        
        int aleatorio = (int) (Math.random() * 100);

        int tentativas = 0;
        do {
            System.out.println("Seu palpite:");
            double num = scanner.nextInt();

             if (num < aleatorio){
                System.out.println("O número dado é menor que o valor gerado.");
                tentativas++;

                } 
                else if (num == aleatorio) {
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("Você fez " +tentativas+ " tentativas" );
                }
                else if (num > aleatorio){
                    System.out.println("O número dado é maior que o valor gerado.");
                    tentativas++;
                }

                 
                } while (true);
            }
        
        }

        


 