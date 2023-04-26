package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class MainBanco {
    private static final Double saldo = null;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Digite o número da conta:");
        String numeroConta = sc.nextLine();
        System.out.println("Digite o nome do usuário");
        String nome = sc.nextLine();
        System.out.println("Deposito inicial? (s/n)");
        char depositoInicial = sc.next().charAt(0);
        if (depositoInicial == 's'){
            System.out.println("Qual valor do deposito inicial?");
            double saldo = sc.nextDouble();
            conta = new Conta(numeroConta, nome, saldo);
        }

        else{
            conta = new Conta(numeroConta, nome, saldo);
        }

        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(conta);

        System.out.println();
        System.out.println("Informe um valor para depositar");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println();
        System.out.println("Dados atualizados");
        System.out.print(conta);

        System.out.println();
        System.out.println("Informe um valor para o saque");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println();
        System.out.println("Dados atualizados");
        System.out.print(conta);

        sc.close();
    }

}
