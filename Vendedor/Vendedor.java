public class Vendedor {
    private String nome;
    private int numProduto;
    private double valorTotal;

    public Vendedor(String nome, int numProduto, double valorTotal) {
        this.nome = nome;
        this.numProduto = numProduto;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setNumProduto(int numProduto) {
        this.numProduto = numProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
