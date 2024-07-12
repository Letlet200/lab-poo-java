import java.util.Scanner;

public class VolumesArgs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double aresta = Double.parseDouble(args [0]);

        var volume = aresta * aresta * aresta;

        if (aresta <=0 ){
            System.out.println("Não é possível calcular, a aresta equivale a um número menor ou igual a 0.");
        }
        else {
            System.out.println("O volume do cubo equivale a "+ volume);
        }




         scanner.close();
    }
}