//Aluna: Gabriela Sena da Silva    2º TI
public class EmpregadoTeste {
    public static void main(String[] args) {
        EmpregadoComissionado empregado = new EmpregadoComissionado("Joao", 12345, 2000, 0.3);
        EmpregadoComissionadoBase empregado2 = new EmpregadoComissionadoBase("Maria", 34567, 1000, 0.2, 1000);

        System.out.println(empregado);
        System.out.println(empregado2);
    }
}
