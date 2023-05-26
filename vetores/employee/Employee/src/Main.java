import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.println("Quantos empregados serão registrados?");
        int entrada = sc.nextInt();

        for (int i = 0; i < entrada; i++){

            System.out.println();
            System.out.println("Empregado #" + (i +1) + ":");
            System.out.printf("ID: ");
            Integer id = sc.nextInt();
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Salário: ");
            Double salario = sc.nextDouble();

            Empregado empregado = new Empregado(id, nome, salario); // instanciou o objeto com as infos
            list.add(empregado); // adicionou o objeto na lista

        }

        System.out.println();
        System.out.println("Digite o ID do funcionário que você deseja aumentar o salário");
        int id = sc.nextInt();
        System.out.println();

        Empregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (empregado == null){
            System.out.println("Esse ID não existe");
        }

        else{
            System.out.println("Informe a porcentagem para aumento");
            double porc = sc.nextDouble();
            empregado.aumentaSalario(porc);
        }

        System.out.println();

        for (Empregado empregados: list){
            System.out.println(empregados);

        }

        sc.close();
    }
}
