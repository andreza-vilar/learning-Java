import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = 0;
        int maiorIdade, posicao;

        System.out.print("Quantas pessoas voce vai digitar? ");
        entrada = sc.nextInt();

        String[] nomes = new String[entrada];
        int[] idades = new int[entrada];

        for (int i = 0; i<entrada; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicao = 0;

        for (int i = 0; i < entrada; i++){
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicao]);

        
        sc.close();
        
    }
}
