import java.util.Random;

public class VendedorTeste {

    public static double[][] criarMatriz(Vendedor[] vendedores){
        double[][] matriz = new double[4][3];
        int cont = 0;
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = vendedores[cont ++].getValorTotal();
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(double[][] matriz, String[] nomes){
        double soma = 0;
        System.out.printf("\n\n%12s%10s%10s%10s%10s\n", "Nome", "1", "2", "3", "Total");
        for(int i=0; i < matriz.length; i++){
            System.out.printf("%12s", nomes[i]);
            for(int j=0; j < matriz[i].length; j++){
                System.out.printf("%10.2f", matriz[i][j]);
                soma += matriz[i][j];
            }
            System.out.printf("%10.2f\n", soma);
            soma = 0;
        }
        System.out.printf("%12s", "Total");
        for(int i=0; i < matriz[0].length; i++){
            for(int j=0; j < matriz.length; j++){
                soma += matriz[j][i];
            }
            System.out.printf("%10.2f", soma);
            soma = 0;
        }
        System.out.println();
    }

    public static void imprimirVendedores(Vendedor[] vendedores){
        for(int i=0; i < vendedores.length; i++){
            System.out.printf("Nome: %12s | numProduto: %3d | valorTotal: %6.2f\n", vendedores[i].getNome(), vendedores[i].getNumProduto(), vendedores[i].getValorTotal());
        }
    }
    public static void main(String[] args) {
        Vendedor[] vendedores = new Vendedor[12];
        String[] nomes = {"Jose", "Seracapiao", "Maria", "Eduarda"};
        Random aleatorio = new Random();

        int cont=0;
        for(int i=0; i < nomes.length; i++){
            for(int j=0; j < 3; j++){
                vendedores[cont++] = new Vendedor (nomes[i], j+1, aleatorio.nextInt(1000));
            }
        }
        imprimirVendedores(vendedores);

        double[][] matriz = criarMatriz(vendedores);
        imprimirMatriz(matriz, nomes);
    }
}
