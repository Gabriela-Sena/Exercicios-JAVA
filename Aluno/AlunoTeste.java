public class AlunoTeste {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno (20567, 2.5, 2.5, 2.0);
        Aluno aluno2 = new Aluno (10547, 2.0, 2.1, 1.0);
        Aluno aluno3 = new Aluno (34567, 1.9, 2.5, 1.7);
        Aluno aluno4 = new Aluno (95877, 1.0, 1.4, 2.0);

        System.out.println("\n\nMatricula: " + aluno1.matricula);
        aluno1.calcularMedia();
        aluno1.calcularFinal();

        System.out.println("\n\nMatricula: " + aluno2.matricula);
        aluno2.calcularMedia();
        aluno2.calcularFinal();

        System.out.println("\n\nMatricula: " + aluno3.matricula);
        aluno3.calcularMedia();
        aluno3.calcularFinal();

        System.out.println("\n\nMatricula: " + aluno4.matricula);
        aluno4.calcularMedia();
        aluno4.calcularFinal();
    }
}
