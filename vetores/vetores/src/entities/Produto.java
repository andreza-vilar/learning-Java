package entities;

public class Produto {
    private String nomeItem;
    private double precoItem;


    public Produto(String nomeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }
    
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

}
