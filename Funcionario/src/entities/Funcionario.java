package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentaSalario(double porcentagem){
        salarioBruto = salarioBruto* (porcentagem/ 100 + 1.0);
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
        }

}