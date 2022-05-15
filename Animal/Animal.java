public class Animal{
    String tipo;
    String nome;
    int idade;
    String barulho;

    public Animal(String tipo, String nome, int idade, String barulho){
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
        this.barulho = barulho;
    }
    public void fazBarulho(){
        System.out.println(barulho);
    }
}