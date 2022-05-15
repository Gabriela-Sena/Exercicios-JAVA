public class Aluno{
    int matricula;
    double prova1;
    double prova2;
    double trabalho;
    double media;
    double faltaPMedia;
    
    public Aluno(int matricula, double prova1, double prova2, double trabalho){
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }
    public void calcularMedia(){// Cada prova vale 2.5 e cada trabalho vale 2.0
        media = ((prova1+prova2+trabalho)/3);
        System.out.printf("Media das 3 avaliacoes: %.2f ", media);
    }
    public void calcularFinal(){
        faltaPMedia = 10.0-media;
        System.out.println("\nFaltam para a prova final:");
        if(faltaPMedia==7.5){
            System.out.println("0");
        }
        else{
            System.out.printf("%.2f",faltaPMedia);
        }
    }
}