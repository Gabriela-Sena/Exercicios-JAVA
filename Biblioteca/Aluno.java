public class Aluno{
    private String nome;
    private int idade;
    private int RA;
    private int[] notas;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getRA() {
        return RA;
    }
    public void setRA(int rA) {
        RA = rA;
    }
    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Aluno(String nome, int idade, int rA, int[] notas) {
        this.nome = nome;
        this.idade = idade;
        RA = rA;
        this.notas = notas;
    }

    public void boletim(){
        System.out.printf("Nome: %s | Idade: %d | RA: %d\n",
            getNome(), getIdade(), getRA());
        
        int cont = 1;
        for(int nota : getNotas()){
            System.out.printf("Disciplina %d: %d\n", cont++, nota);
        }
        System.out.println();
    }
}