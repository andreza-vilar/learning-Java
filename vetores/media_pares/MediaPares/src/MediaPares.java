import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada;
        System.out.print("Quantos elementos vai ter o vetor? ");
        entrada = sc.nextInt();

        int[] numeros = new int[entrada];
        double media = 0;
        int soma = 0;
        int contador = 0;

        for (int i = 0; i<entrada; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                soma = numeros[i] + soma;
                contador++;
            }
        }

        if (contador != 0){
            media = soma / contador;
            System.out.printf("MÉDIA DOS PARES = %.1f\n", media);
        }
        if (contador == 0){
            System.out.println("NENHUM PAR");
        }


        sc.close();
        
    }
}
