package entities; 

public class Estoque{
    public String Nome;
    public double Preco;
    public int Quantidade;

    public double valorTotalEstoque(){
        return Preco * Quantidade;
    }
    public void addProdutos(int quantidade){
        this.Quantidade += quantidade;
    }
    public void removeProdutos(int quantidade){
        this.Quantidade -= quantidade;
    }

        public String toString() {
            return Nome
            + ", $ "
            + String.format("%.2f", Preco)
            + ", "
            + Quantidade
            + " units, Total: $ "
            + String.format("%.2f", valorTotalEstoque());
        }
    

}
