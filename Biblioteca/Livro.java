//Alunas: Gabriela Sena e Luísa Pedrolli    2TI
public class Livro {
    private String nome; //atributos criados
    private int isbn;
    private int ano;
    private String autores; 
    private boolean disponivel = true; // boolean sempre vai retornar 'true' que é igual 1 ou 'false' que é igual a 0
    
    public Livro(String nome, int isbn, int ano, String autores, boolean disponivel) { //metodo construtor criado
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.autores = autores;
        this.disponivel = disponivel;
    }

    public String getNome() { //getters e setters criados
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public boolean isDisponivel() { //descobrir por que não é "get" mas "in"
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
