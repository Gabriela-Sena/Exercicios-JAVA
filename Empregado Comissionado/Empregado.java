//Aluna: Gabriela Sena da Silva    2º TI
public class Empregado{
    private String nome;
    private int numeroSeguro;

    public Empregado(String nome, int numeroSeguro) {
        this.nome = nome;
        this.numeroSeguro = numeroSeguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(int numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Seguro: %d |", getNome(), getNumeroSeguro());
    }

}