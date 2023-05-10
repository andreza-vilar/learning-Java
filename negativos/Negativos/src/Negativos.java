import java.util.Scanner;
import java.util.Locale;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você vai digitar?");
        int entrada = sc.nextInt();

        int[] vetor = new int[entrada];

        for (int i = 0; i < entrada; i++){
            System.out.println("digite um numero:");
            vetor[i] = sc.nextInt();
            
        }
        System.out.println();
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.print(vetor[i]);
                System.out.println();
            }
        }


        sc.close();
    }
}
