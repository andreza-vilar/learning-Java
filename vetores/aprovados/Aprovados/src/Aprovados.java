import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada;

        System.out.print("Quantos alunos serão digitados? ");
        entrada = sc.nextInt();

        String[] nomes = new String[entrada];
        double[] nota1 = new double[entrada];
        double[] nota2 = new double[entrada];


        for (int i = 0; i < entrada; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        
        for (int i = 0; i <entrada; i++){
            if((nota1[i] + nota2[i]) / 2 >= 6){
                System.out.println(nomes[i]);
            }
        }
        
        sc.close();
        
    }
}
