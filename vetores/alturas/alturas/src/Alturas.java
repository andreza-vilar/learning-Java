import java.util.Scanner;
import java.util.Locale;

public class Alturas{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada, numeroMenores;
        double media,  porcentagem, alturaTotal;

        System.out.print("Quanta pessoas serão digitadas? ");
        entrada = sc.nextInt();

        String[] nomes = new String[entrada];
        int[] idade = new int[entrada];
        double[] altura = new double[entrada];
       

        for (int i = 0; i < entrada; i++ ){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Dados\n");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        alturaTotal = 0;
        numeroMenores = 0;

        for (int i = 0; i < entrada; i++){
            if (idade[i] < 16){
                numeroMenores++;
            }
            alturaTotal = alturaTotal + altura[i];
        }
        
        porcentagem = ((double)numeroMenores / entrada) * 100;
        media = alturaTotal / entrada;

        System.out.printf("\nAltura media = %.2f\n", media);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        for(int i=0; i<entrada; i++) {
	        if (idade[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }

        sc.close();
    }
}
