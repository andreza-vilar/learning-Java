import java.util.Scanner;
import java.util.Locale;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar?");
        int entrada = sc.nextInt();

        double[] vetor = new double[entrada];

        for (int i = 0; i < entrada; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        double soma, media;
        soma = 0;

        for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        media = 0;
        media = soma / entrada;

        System.out.println();

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.println();

        System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);
        

        sc.close();
    }
}
