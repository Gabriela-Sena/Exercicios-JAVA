// Aluna: Gabriela Sena da Silva   2ºTI
public class Fatura {
    String codigo;
    String descricao;
    int qtd;
    Double preco;
    Double valor;

    public Fatura(String codigo, String descricao, int qtd, Double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }
    public void getFatura (int qtd, Double preco){
        if(qtd>0 && preco>0){
           valor=qtd*preco;
           System.out.println("Valor total da compra: " + valor);
        }
        if(qtd<0 && preco>0){
            valor=0*preco;
            System.out.println("Valor total da compra: " + valor);
        }
        if(qtd>0 && preco<0){
            valor=qtd*0.0;
            System.out.println("Valor total da compra: " + valor);
        }
        else{
            valor=0*0.0;
            System.out.println("Valor total da compra: " + valor);
        }
    }
}
