public class CarroTeste {
    public static void main(String[] args){
        Carro carro1 = new Carro ("Bravo", "Laranja", 100);

        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade: " + carro1.velocidade);

        carro1.acelerar();
        carro1.frear();
        carro1.acenderFarol();
    }
}
