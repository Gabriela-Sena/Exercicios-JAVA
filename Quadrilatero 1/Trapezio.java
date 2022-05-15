public class Trapezio extends Quadrilatero{
    private double baseMaior;
    private double baseMenor;
    private double altura;
    
    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
    
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    public double getBaseMaior() {
        return baseMaior;
    }
    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }
    public double getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
