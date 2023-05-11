import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, posicao = 0;
        double maior = 0;

        System.out.println("quantos números você vai digitar? ");
        entrada = sc.nextInt();

        double[] numeros = new double[entrada];


        for (int i = 0; i < entrada; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i + 1;
            }
        }

        System.out.printf("Maior numero %.1f: ", maior);
        System.out.printf("posição do maior numero %d: ", posicao);


        sc.close();
    }
}
