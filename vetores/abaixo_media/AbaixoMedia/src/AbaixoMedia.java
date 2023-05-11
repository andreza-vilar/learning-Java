import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = 0;

        double media = 0, soma = 0;
        

        System.out.print("Quantos elementos vai ter o vetor? ");
        entrada = sc.nextInt();

        double[] numeros = new double[entrada];

        for (int i = 0; i < entrada; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            soma = numeros[i] + soma;
        }

        media = soma / entrada;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

        for (int i = 0; i < entrada; i++){
            if (numeros[i] < media){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
        
    }
}
