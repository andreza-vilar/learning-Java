package entities;
public class Conta {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(String numeroConta, String nomeTitular, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public Conta (String numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

    public String getNomeTitular() {
        return nomeTitular;
    }
     public String getNumeroConta(){
        return numeroConta;
     }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void deposito(double valor){
       saldo += valor;
    }

    public void saque(double valor){
        saldo = saldo - valor -5;
    }

    @Override
    public String toString() {
        return "Account "
        + numeroConta
        + ", Titular: "
        + nomeTitular
        + ", Saldo: $ "
        + String.format("%.2f", saldo);
    }
}