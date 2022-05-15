public class PagavelTeste{

    public static void main(String[] args) {
        Pagavel[] pag = new Pagavel [2];

        pag[0]= new Fatura ("mouse", 300, 2);
        pag[1]=new EmpregadoAssalariado("Jose", 12, 1);

        for(Pagavel p: pag){
            System.out.println(p);
        }
    }
}