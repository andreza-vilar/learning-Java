import java.util.Scanner;
import entities.Funcionario;
import java.util.Locale;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionário");
        funcionario.nome = sc.nextLine();
        System.out.println("Informe agora o valor do salário bruto dele");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Digite o valor do imposto que o funcionário precisa pagar");
        funcionario.imposto = sc.nextDouble();

        System.out.printf("Salário líquido do funcionário: %n",funcionario.salarioLiquido());
        System.out.println();
        System.out.println("Informe a % de aumento no salário do funcionario");
        double porcentagem = sc.nextDouble();
        funcionario.aumentaSalario(porcentagem);


        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}
