public class Conta{
    String nome;
    double saldo;

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void deposito(double valor){
        if(valor > 0)
            saldo = saldo + valor;
    }

    public void saque(double valor){
        if(saldo >= valor && valor > 0)
            saldo = saldo - valor;
        else
            System.out.println("Saldo insuficiente");
    }
}