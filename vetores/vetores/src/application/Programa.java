package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Produto;

public class Programa {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("quantos produtos você deseja registrar?");
        int entrada = sc.nextInt();

        Produto[] vetor = new Produto[entrada];

        for (int i = 0; i<entrada; i++){
            sc.nextLine();
            System.out.println("nome do produto");
            String nome = sc.nextLine();
            System.out.println("preço do produto");
            double preco = sc.nextDouble();
            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0.0;

        for (int i = 0; i< entrada; i++){
            soma += vetor[i].getPrecoItem();
        }
        double media = soma / entrada;

        System.out.println();
        System.out.println(media);
        System.out.println();

        sc.close();
    }
    
}

