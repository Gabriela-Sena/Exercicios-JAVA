public class Fatura implements Pagavel {
    private String descricao;
    private double preco;
    private int quantidade;

    public Fatura(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double valorPagamento() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Fatura [descricao=" + descricao + 
        ", preco=" + preco +
        ", quantidade=" + quantidade + 
        "pagamento=" + valorPagamento() + "]";
    }


}