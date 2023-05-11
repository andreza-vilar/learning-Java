import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;

        System.out.print("Quantos valores vai ter cada vetor? ");
        entrada = sc.nextInt();

        int[] vetorA = new int [entrada];
        int[] vetorB = new int [entrada];
        int[] vetorC = new int [entrada];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < entrada; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < entrada; i++){
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < entrada; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println();
        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < entrada; i++){
            System.out.println(vetorC[i]);
        }
        


        sc.close();
    }
}
