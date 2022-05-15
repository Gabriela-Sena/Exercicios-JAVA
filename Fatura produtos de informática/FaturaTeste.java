// Aluna: Gabriela Sena da Silva   2ºTI
public class FaturaTeste {
    public static void imprimirFatura(Fatura cliente){
        System.out.println("\nCodigo do produto: " + cliente.codigo);
        System.out.println("Descricao do produto: " + cliente.descricao);
        System.out.println("Quantidade de produtos: "  + cliente.qtd);
        System.out.println("Preco por unidade:  " + cliente.preco);
    }
    public static void main(String[] args){
        Fatura cliente1 = new Fatura("0005A8", "Fita de dados", 1, 418.0);
        Fatura cliente2 = new Fatura("0005B9", "Cartucho de tinta", 3, 222.0);
        Fatura cliente3 = new Fatura("0045H2", "Cartucho toner", 0, 478.30);
        Fatura cliente4 = new Fatura("00305T1", "Papel fotografico", 1, 0.0);

        imprimirFatura(cliente1);
        cliente1.getFatura(1, 418.0);

        imprimirFatura(cliente2);
        cliente2.getFatura(3, 222.0);

        imprimirFatura(cliente3);
        cliente3.getFatura(0, 478.30);

        imprimirFatura(cliente4);
        cliente4.getFatura(1, 0.0);
    }
}
