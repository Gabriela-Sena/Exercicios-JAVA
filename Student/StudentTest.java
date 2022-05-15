
import java.util.Random;
import java.util.ArrayList;
public class StudentTest{ //falta o vetor de notas na classe 

//public static String gerarNotas(double)

public static void imprimirMatriz(String[][] matriz, String[] nomes){
    double soma = 0;
    System.out.printf("\n\n%12s%10s%10s%10s%10s\n", "Materia", "1 B", "2 B", "3 B","4 B");
    for(int i=0; i < matriz.length; i++){
        System.out.printf("%12s", nomes[i]);
        for(int j=0; j < matriz[i].length; j++){
            System.out.printf("%10.2f", matriz[i][j]);
            //soma += matriz[i][j];// arrumar
        }
        System.out.printf("%10.2f\n", soma);//arrumar
        soma = 0;
        System.out.printf("Portugues\nMatematica\nArte\nFilosofia\nGeografia\nHistoria\nQuimica\nFisica");
    }
    System.out.printf("%12s", "4 B");
    for(int i=0; i < matriz[0].length; i++){
        for(int j=0; j < matriz.length; j++){
           // soma += matriz[j][i];//arrumar
        }
        System.out.printf("%10.2f", soma);//arrumar
            soma = 0;
    }
    System.out.println();
}

public static String [][] criarMatriz(Student[] alunos){
    String[][] matriz = new String[11][5];
    int cont=0;
    for(int i=0; i < matriz.length; i++){
        for(int j=0; j < matriz[i].length; j++){
            matriz[i][j] = alunos[cont ++].getNome();
        }
    }
    return matriz;
}    

public static void imprimirAlunos(Student[] alunos){
    for(int i = 0; i< alunos.length; i++){
    System.out.printf("Nome %12s | idade %3d | ra %d \n",alunos[i].getNome(), alunos[i].getIdade(), alunos[i].getRa());
    }
}
public static void main(String[] args){

    Student[] alunos = new Student[10];
    String[] nomes = {"Ana","Bruno","Carlos","Daniela","Emanuel","Fabiane","Gabriel","Henrique","Iris","Joao"};
    
    int[] idades = {15, 15, 16, 15, 17, 16, 16, 15, 15, 17};
    Random aleatorio = new Random();

   
    for(int i = 0; i < nomes.length; i++){ //nomes.length
    
          //  alunos[cont] = new Student(nomes[i], idades[i], ras[i]);
          alunos[i] = new Student(nomes[i], idades[i], aleatorio.nextInt(1000));
        
    }
    imprimirAlunos(alunos);
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    for (int i = 0; i < 8; i++){

        Random ale = new Random();
        numeros.add(ale.nextInt(100 + 1));
    }
    System.out.println("Notas aleatorias:");
    System.out.println(numeros.toString());

    System.out.printf("\n\nMateria        |1 B      |2 B      |3 B       |4 B\nPortugues      |13       |22        |57        |90          \nMatematica\nArte\nFilosofia\nGeografia\nHistoria\nQuimica\nFisica");

    String[][] matriz = criarMatriz(alunos);
    //imprimirMatriz(matriz, nomes);

}
}