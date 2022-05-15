//Aluna: Gabriela Sena da Silva    2º TI
public class EmpregadoComissionadoBase extends EmpregadoComissionado{
    //tiramos os atributos e os metodos get e set repetidos pois já estao sendo herdados da classe EmpregadoComissionado, que por sequencia está herdando os atributos da classe Empregado
    private double salarioBase;
    
   
    public EmpregadoComissionadoBase(String nome, int numeroSeguro, double vendasBrutas, double taxaComissao, double salarioBase) {
        super(nome, numeroSeguro, vendasBrutas, taxaComissao);
        this.salarioBase = salarioBase;
    }
    //continuamos com as coisas do salario base pois a classe que e herdada não o possui
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override // sobreescrevendo um metodo que ta sendo herdado
    public double ganhos() {
        return super.ganhos() + getSalarioBase();
    }
    @Override
    public String toString() {
        return String.format("%s Salario Base %.2f\n", super.toString(), getSalarioBase());
    }
    

}
