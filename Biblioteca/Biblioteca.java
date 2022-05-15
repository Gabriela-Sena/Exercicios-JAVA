//Alunas: Gabriela Sena e Luísa Pedrolli    2TI
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Biblioteca {
    public static Scanner input;

    public static void menu(){ //metodo menu

        System.out.println("Menu:");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Modificar livro");
        System.out.println("3. Remover livro");
        System.out.println("4. Alugar livro");
        System.out.println("5. Listar livros disponiveis");
        System.out.println("6. Listar livros indisponiveis");
        System.out.println("7. Sair");    
    }

    public static void imprimirInfo(ArrayList<Livro> livros){ //metodo para imprimir todas as informações do livro
    String x;
    for(int i=0; i < livros.size(); i++){
        if(livros.get(i).isDisponivel() == true)
        x = "Disponivel";
        else 
        x = "Indisponivel";
        System.out.printf("Livro %d. Nome: %s | ISBN:0%d | Ano: %d | Autor: %s | Disponibilidade: %s \n", i, livros.get(i).getNome(), livros.get(i).getIsbn(), livros.get(i).getAno(), livros.get(i).getAutores(), x);
    }
    }

    public static void criarLivrosIniciais(ArrayList<Livro> livros){ //colocar Isbn real e tentar deixar aleatorio
        livros.add (new Livro("O morro dos ventos Uivantes", 127654, 1847, "Emily Bronte", true ));
        livros.add (new Livro("Agua para elefantes", 13, 2006, "Sara Gruen", true));
        livros.add (new Livro("Como eu era antes de voce", 14, 2012, "Jojo Moyes", true));
        livros.add (new Livro("Piano vermelho", 15, 2017, "Josh Malerman", true));
        livros.add (new Livro("Mentirosos", 16, 2014, "E. Lockhart", true));
        livros.add (new Livro("Primeiras Estorias",17, 2001, "Joao Guimaraes Rosa", true));
        livros.add (new Livro("Amanhecer", 18, 2008, "Stephenie Meyer", true));
        livros.add (new Livro("Emma", 19, 1815, "Jane Austen", true));
        livros.add (new Livro("Fahrenheit", 81, 1953, "Ray Bradbury", true));
        livros.add (new Livro("Alice no pais das maravilhas", 13, 1865, "Lewis Carroll", true));
    }
    //CADASTRAR LIVRO
    public static void cadastrarLivro(ArrayList<Livro> livros){ //Funciona!!!!!!!! Aleluia Deus
        
        System.out.println("Digite o nome do livro: "); 
        String nome = input.nextLine(); //armazena o nome do novo livro

        System.out.println("Digite o isbn: (comecando com 1 ou 0 e com ate 8 digitos) ");
        int isbn = input.nextInt(); //armazena o isbn do livro

        System.out.println("Digite o ano do livro: (Formato aaaa) ");
        int ano = input.nextInt(); //armazena o ano do livro
        input.nextLine();

        System.out.println("Digite o autor do livro: (Se houver mais de um autor escrever na forma PrimeiroAutor / segundoAutor)");
        String autores = input.nextLine(); //armazena o autor do livro (ver o que deu errado)

        livros.add(new Livro(nome, isbn, ano, autores, true));
    }

    public static void modificarLivro(ArrayList<Livro> livros){ //MODIFICAR LIVRO
    System.out.println("Livros cadastrados: ");

    imprimirInfo(livros); //Imprime uma lista com todas as informacoes dos livros

    System.out.println("Digite o indice do livro que voce deseja modificar: ");
    int i = input.nextInt();
    input.nextLine();

    Livro livro = livros.get(i);
    System.out.println("O que voce deseja modificar? 1 - Nome do livro / 2 - ISBN do livro / 3 - Autores do livro / 4 - Ano de publicacao do livro"); //pequeno menu para escolher o que mudar 
    int resp = input.nextInt(); //recebe a resposta do usuario
    System.out.println("Pressione 'enter'");
    input.nextLine();
        switch(resp){ //escolher opcao do menu

        case 1: 
        System.out.println("-------------------------------------------------"); 
        livro.setNome(input.nextLine());
        System.out.println("Digite o novo nome do livro: ");
        livro.setNome(input.nextLine());//altera o nome
        break;

        case 2:
        System.out.println("Digite o novo isbn do livro: ");
        livro.setIsbn(input.nextInt()); //altera o isbn
        break;

        case 3:
        System.out.println("Digite o novo autor do livro: ");
        livro.setAutores(input.nextLine()); //altera o nome do autor NÃO LEU
        break;

        case 4: 
        System.out.println("Digite o novo ano do livro: (Formato aaaa)");
        livro.setAno(input.nextInt()); //altera o ano do livro
        break;
        }
    }
    public static void excluirLivro(ArrayList<Livro> livros){
        System.out.println("Livros: ");
        imprimirInfo(livros);
        System.out.println("\nDigite o indice do livro que deseja excluir: ");
        int resp = input.nextInt();

        livros.remove (resp );

        System.out.println("Livro removido!\n");
    } 

    public static void alugarLivro(ArrayList<Livro> livros){
        System.out.println("Livros: ");
        imprimirInfo(livros);
        System.out.println("Qual o indice do livro voce deseja alugar? ");
        int i = input.nextInt(); //recebe a resposta do usuario

        if(livros.get(i).isDisponivel() == true){ 
        livros.get(i).setDisponivel(false); //nao funciona 
        System.out.println("Livro alugado! ");
        }else 
        System.out.println("Livro indisponivel! ");
        imprimirInfo(livros);

    }

    public static void ImprimirLivrosDisp(ArrayList<Livro> livros){
        String [] livrosDisp = new String[livros.size()]; //criacao de um vetor para armazenar os livros disponiveis 

            for(int i = 0; i< livros.size(); i++){
            for(int k = 0; k < livros.size(); k++){
            if(livros.get(k).isDisponivel() == true){ //encontra os livros disponiveis e joga eles em um vetor
            livrosDisp[i] = livros.get(k).getNome();
            i++;
            }
            }
            }for(int j=0; j < livros.size(); j++){ //imprime vetor com os livros disponiveis
            if(livrosDisp[j] != null)
                System.out.println(livrosDisp[j]);
            }
    }

    public static void ImprimirLivrosIndisp(ArrayList<Livro> livros){
        String [] livrosIndisp = new String[livros.size()]; //criacao de um vetor para armazenar os livros indisponiveis 

            for(int i = 0; i < livros.size(); i++){
            for(int k = 0; k < livros.size(); k++){
                
            if(livros.get(k).isDisponivel() == false){ //encontra os livros indisponiveis e joga eles em um vetor
            livrosIndisp[k] = livros.get(k).getNome();
            
            }
            }
            }for(int j=0; j < livros.size(); j++){ //imprime vetor com os livros indisponiveis
            if(livrosIndisp[j] != null)
                System.out.println(livrosIndisp[j]);
            }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<Livro>(); //criacao do arraylist pra iniciar o sistema com 10 livros
        criarLivrosIniciais(livros);

        int menu = 1;
        while((menu>=1)&(menu<=6)){//rodar o menu enquanto o menu>=1 ou menu<=7{
            System.out.println("-------------------------------------------------");
            menu();// chamando o metodo menu
            menu = input.nextInt();
            input.nextLine();//lendo metodo menu
            System.out.println("-------------------------------------------------");
            switch(menu){ //escolher opcao do menu
                case 1:
                cadastrarLivro(livros);
                    break;
                case 2:
                modificarLivro(livros);
                    break;
                case 3:
                excluirLivro(livros);//remover livro
                    break;
                case 4:
                //alugar livro -- vai ter que mudar o "disponivel" para "indisponivel"
                alugarLivro(livros);
                    break;
                case 5:
                ImprimirLivrosDisp(livros);//listar livros disponiveis
                    break;
                case 6:
                ImprimirLivrosIndisp(livros);
                //listar livros indisponiveis
                    break;
            }
        }
        
    }
        //System.out.println(livros.size());
}