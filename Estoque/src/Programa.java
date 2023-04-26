import java.util.Scanner;
import entities.Estoque;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque produto;
        produto = new Estoque();

        System.out.println("Informe os dados do produto: ");
        System.out.println("Digite o nome: ");
        produto.Nome = sc.nextLine();
        System.out.println("Digite o preço: ");
        produto.Preco = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        produto.Quantidade = sc.nextInt();

        System.out.println("digite uma quantidade para ser adicionada ");
        int numero = sc.nextInt();
        produto.addProdutos(numero);

        System.out.println(produto);

        System.out.println("Agora pra remover");

        int remocao = sc.nextInt();

        produto.removeProdutos(remocao);

        System.out.println(produto);

        sc.close();
    }
}
