import java.util.Scanner;
import entities.Retangulo;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retNovo = new Retangulo();

        System.out.println("Informe a altura do retângulo");
        retNovo.altura = sc.nextDouble();
        System.out.println("Agora a largura do retângulo");
        retNovo.largura = sc.nextDouble();

        System.out.printf("Área: %.2f%n", retNovo.area());
        System.out.printf("Perímetro: %.2f%n",retNovo.perimetro());
        System.out.printf("Diagonal: %.2f%n",retNovo.diagonal());

        sc.close();
    }
}
