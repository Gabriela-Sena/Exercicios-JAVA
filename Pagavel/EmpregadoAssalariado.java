public class EmpregadoAssalariado extends Empregado {
    private double salario;

    @Override
    public String toString() {
        return "EmpregadoAssalariado [ nome=" + getNome() + 
        ", seguro=" + getNumeroSeguro() + 
        "salario=" + salario + "pagamento=" + valorPagamento() + "]";
    }

    @Override
    public double valorPagamento() {
        return getSalario();
    }


    public EmpregadoAssalariado(String nome, int numeroSeguro, double salario) {
        super(nome, numeroSeguro);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}