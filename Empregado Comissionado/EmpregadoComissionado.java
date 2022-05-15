//Aluna: Gabriela Sena da Silva    2º TI
public class EmpregadoComissionado extends Empregado{

    private double vendasBrutas;
    private double taxaComissao;
    
    public double ganhos(){
        return vendasBrutas*taxaComissao;
    }
    
    public double getVendasBrutas() {
        return vendasBrutas;
    }
    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    public EmpregadoComissionado(String nome, int numeroSeguro, double vendasBrutas, double taxaComissao) {
        super(nome, numeroSeguro);
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public String toString() {
        return String.format("%s | Vendas Brutas: %.2f | Taxa: %.2f | Salario: %.2f |",
        super.toString(), getVendasBrutas(), getTaxaComissao(), ganhos());
    }
    
}