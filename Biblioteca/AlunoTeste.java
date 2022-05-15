import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class AlunoTeste {
    public static Scanner input;
    public static int contRA = 10;

    public static void cadastrarAluno(ArrayList<Aluno> alunos){
        System.out.println("Digite o nome:");
        String nome = input.nextLine();
        System.out.println("Digite a idade:");
        int idade = input.nextInt();

        System.out.println("Digite as notas:");
        int[] notas = new int[8];
        for(int i = 0; i < notas.length; i++){
            System.out.printf("%d: ", i+1);
            notas[i] = input.nextInt();
        }

        alunos.add(new Aluno(nome, idade, contRA++, notas));
    }

    public static void criarAlunosIniciais(ArrayList<Aluno> alunos){
        String[] nomes = {"Joao", "Maria", "Jose", "Lucas", "Leticia",
            "Amanda", "Paulo", "Pedro", "Larissa", "Ana"};
        Random aleatorio = new Random();
        int[] notas;

        for(int i = 0; i < 10; i++){
            notas = new int[8];

            for(int j = 0; j < notas.length; j++)
                notas[j] = aleatorio.nextInt(101);

            alunos.add(new Aluno(nomes[i], 17+aleatorio.nextInt(50), i, notas));
        }
    }

    public static void imprimirBoletins(ArrayList<Aluno> alunos){
        for(Aluno a : alunos)
            a.boletim();
    }

    public static void modificarAluno(ArrayList<Aluno> alunos){
        System.out.println("Digite o RA do aluno para modifica-lo:");
        int RA = input.nextInt();
        input.nextLine();
        Aluno aluno = alunos.get(RA);
        System.out.println("Digite o novo nome:");
        aluno.setNome(input.nextLine());
        System.out.println("Digite a nova idade:");
        aluno.setIdade(input.nextInt());

        int[] notas = aluno.getNotas();
        for(int i = 0; i < notas.length; i++){
            System.out.printf("%d: ", i+1);
            notas[i] = input.nextInt();
        }
    }

    public static void consultarBoletim(ArrayList<Aluno> alunos){
        System.out.println("Digite o RA:");
        alunos.get(input.nextInt()).boletim();    
    }

    public static void distribuicaoNotas(ArrayList<Aluno> alunos){
        int[] distribuicao = new int[11];
        int cont = 0;

        for(int i = 0; i <= 100; i+=10){
            for(Aluno aluno : alunos){
                int[] notas = aluno.getNotas();

                for(int nota : notas){
                    if(nota >= i && nota <= i+9)
                        distribuicao[cont]++;
                }
            }
            cont++;
        }

        cont = 0;
        for(int i = 0; i < 100; i+=10){
            System.out.printf("%2d-%2d: ", i, i+9);
            for(int j = 0; j < distribuicao[cont]; j++)
                System.out.print("*");
            System.out.println();
            cont++;
        }

        System.out.printf("%5d: ", 100);
        for(int j = 0; j < distribuicao[10]; j++)
            System.out.print("*");
        System.out.println();
    }

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Modificar aluno");
        System.out.println("3. Consultar boletim");
        System.out.println("4. Imprimir boletins");
        System.out.println("5. Apresentar distribuicao de notas");
        System.out.println("6. Apresentar distribuicao de idade");
        System.out.println("7. Sair");    
    }

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        input = new Scanner(System.in);
        criarAlunosIniciais(alunos);

        int menu = 0;

        do{
            menu();
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    cadastrarAluno(alunos);
                    break;
                case 2:
                    modificarAluno(alunos);
                    break;
                case 3:
                    consultarBoletim(alunos);
                    break;
                case 4:
                    imprimirBoletins(alunos);
                    break;
                case 5:
                    distribuicaoNotas(alunos);
                    break;
                case 6:
                    break;
            }
        }while(menu != 7);
    }
}
