public abstract class Forma{
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Forma(String cor) {
        this.cor = cor;
    }

    @Override
    public String imprimirCor() {
        return cor;
    }
    
}