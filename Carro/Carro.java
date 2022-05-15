public class Carro {
    String modelo;
    String cor;
    int velocidade;

    public Carro(String modelo, String cor, int velocidade){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    public void acelerar(){
        System.out.println("Acelerou o carro!");
    }
    public void frear(){
        System.out.println("Freou o carro!");
    }
    public void acenderFarol(){
        System.out.println("Acendeu farol!");
    }
}
