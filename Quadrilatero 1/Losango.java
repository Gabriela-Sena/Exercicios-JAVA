public class Losango extends Quadrilatero{
    private double diagonalMaior;
    private double diagonalMenor;
    
    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }
    public double getDiagonalMaior() {
        return diagonalMaior;
    }
    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    
}
