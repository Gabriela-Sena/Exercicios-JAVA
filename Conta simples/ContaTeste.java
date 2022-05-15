public class ContaTeste {
    public static void imprimirConta(Conta pessoa){
        System.out.println("Nome " + pessoa.nome);
        System.out.println("Saldo " + pessoa.saldo);
    }   
    public static void main(String[] args) {
        Conta pessoa = new Conta("Joao", 1000);
        Conta pessoa2 = new Conta("Maria", 500);
        Conta pessoa3 = new Conta("Jose", 300);
        imprimirConta(pessoa);

        imprimirConta(pessoa2);

        imprimirConta(pessoa3);

        pessoa3.deposito(-400);

        imprimirConta(pessoa3);

        pessoa3.saque(-1200);

        imprimirConta(pessoa3);
    }
}
