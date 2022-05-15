public class AnimalTeste{
    public static void main(String[] args){

        Animal dino = new Animal("dinossauro", "Trex", 56, "rawh!");
        //dino.nome = "Trex";
        //dino.tipo = "Dinossauro";
        //dino.idade = 56;
        //dino.barulho = "Rawh!";
        System.out.println(dino.nome);
        System.out.println(dino.tipo);
        System.out.println(dino.idade);
        System.out.println(dino.barulho);
        
        Animal gato = new Animal("Felino", "Sabrina", 7, "Miau!");
        //gato.nome = "Sabrina";
        //gato.tipo = "Felino";
        //gato.idade = 7;
        //gato.barulho = "Miau!";
        System.out.println(gato.nome);
        System.out.println(gato.tipo);
        System.out.println(gato.idade);
        System.out.println(gato.barulho);
    }
}