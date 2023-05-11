import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, numerosPares;
        System.out.println("Quantos numeros você vai digitar? ");
        entrada = sc.nextInt();

        int[] numeros = new int[entrada];

        for (int i=0; i<entrada; i++){
            System.out.print("Digite um numero:\n");
            numeros[i] = sc.nextInt();
        }

        numerosPares = 0;

        System.out.println("números pares:");
        for (int i = 0; i <entrada; i++){
            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
                numerosPares += 1;
            }
        }

        System.out.printf("QUANTIDADE DE PARES = %d: ", numerosPares);


        sc.close();
        
    }
}
