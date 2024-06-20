import java.util.Scanner;

import Classes.Aluno;
import Classes.Cadastro;
import Classes.CasasH;
import Classes.Console;

import Interfaces.Casas;

public class Sistema {

    private static Scanner scanner = new Scanner(System.in);

    private static void exibirMenu() {
        menu();
        System.out.println("\n");
        System.out.println("[1] Cadastrar Aluno");
        System.out.println("[2] Remover Aluno");
        System.out.println("[3] Exibir Aluno");
        System.out.println("[4] Listar todos os Alunos");
        System.out.println("[0] Sair...");
        System.out.print("\nInforme uma opção: ");
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1: // Cadastrar Aluno
                cadastrarNovoAluno();
                break;
            case 2: // Remover Aluno
                removerAluno();
                break;
            case 3: // Exibir Aluno
                exibirAluno();
                break;
            case 4: // Listar Alunos
                listarAlunos();
                break;
            case 0: // Sair
                mensagemDeSaida();
                break;
            default:
                System.out.println("\nOpção inválida.... Digite novamente...");
                break;
        }
    }

    public static void cadastrarNovoAluno() {

        int grifinoria = 0;
        int sonserina = 0;
        int corvinal = 0;
        int lufalufa = 0;

        System.out.println("Bem-vindo ao Chapéu Seletor de Hogwarts!");
        System.out.println("Responda às seguintes perguntas para descobrir sua casa.");

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe sua matrícula:");
        String matricula = scanner.nextLine();

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha restante

        System.out.println("Informe seu sexo:");
        String sexo = scanner.nextLine();

        System.out.println("Informe seu Status de Sangue (Puro ou Trouxa):");
        String statusDeSangue = scanner.nextLine();

        // Pergunta 1
        System.out.println("Pergunta 1: Qual dessas qualidades você mais valoriza?");
        System.out.println("1. Coragem");
        System.out.println("2. Ambição");
        System.out.println("3. Inteligência");
        System.out.println("4. Lealdade");
        int resposta1 = scanner.nextInt();
        switch (resposta1) {
            case 1:
                grifinoria++;
                break;
            case 2:
                sonserina++;
                break;
            case 3:
                corvinal++;
                break;
            case 4:
                lufalufa++;
                break;
        }

        // Pergunta 2
        System.out.println("Pergunta 2: Qual dessas criaturas mágicas você prefere?");
        System.out.println("1. Fênix");
        System.out.println("2. Serpente");
        System.out.println("3. Coruja");
        System.out.println("4. Texugo");
        int resposta2 = scanner.nextInt();
        switch (resposta2) {
            case 1:
                grifinoria++;
                break;
            case 2:
                sonserina++;
                break;
            case 3:
                corvinal++;
                break;
            case 4:
                lufalufa++;
                break;
        }

        // Pergunta 3
        System.out.println("Pergunta 3: Qual dessas matérias você mais gosta?");
        System.out.println("1. Defesa Contra as Artes das Trevas");
        System.out.println("2. Poções");
        System.out.println("3. Feitiços");
        System.out.println("4. Herbologia");
        int resposta3 = scanner.nextInt();
        switch (resposta3) {
            case 1:
                grifinoria++;
                break;
            case 2:
                sonserina++;
                break;
            case 3:
                corvinal++;
                break;
            case 4:
                lufalufa++;
                break;
        }

        // Pergunta 4
        System.out.println("Pergunta 4: Qual desses lugares você preferiria explorar?");
        System.out.println("1. A Floresta Proibida");
        System.out.println("2. As Masmorras");
        System.out.println("3. A Torre da Corvinal");
        System.out.println("4. A cozinha dos elfos domésticos");
        int resposta4 = scanner.nextInt();
        switch (resposta4) {
            case 1:
                grifinoria++;
                break;
            case 2:
                sonserina++;
                break;
            case 3:
                corvinal++;
                break;
            case 4:
                lufalufa++;
                break;
        }

        // Pergunta 5
        System.out.println("Pergunta 5: Qual dessas palavras melhor descreve você?");
        System.out.println("1. Destemido");
        System.out.println("2. Astuto");
        System.out.println("3. Sábio");
        System.out.println("4. Trabalhador");
        int resposta5 = scanner.nextInt();
        switch (resposta5) {
            case 1:
                grifinoria++;
                break;
            case 2:
                sonserina++;
                break;
            case 3:
                corvinal++;
                break;
            case 4:
                lufalufa++;
                break;
        }

        // Determinar a casa com mais pontos
        String casa;
        if (grifinoria >= sonserina && grifinoria >= corvinal && grifinoria >= lufalufa) {
            casa = "Grifinória";
            Casas.Grifinoria();
        } else if (sonserina >= grifinoria && sonserina >= corvinal && sonserina >= lufalufa) {
            casa = "Sonserina";
            Casas.Sonserina();
        } else if (corvinal >= grifinoria && corvinal >= sonserina && corvinal >= lufalufa) {
            casa = "Corvinal";
            Casas.Corvinal();
        } else {
            casa = "Lufa-Lufa";
            Casas.LufaLufa();
        }

        Aluno aluno = new Aluno(nome, matricula, idade, sexo, statusDeSangue, casa);
        Cadastro.cadastrar(aluno);
    }

    public static void removerAluno() {
        // Implementar lógica para remover aluno
    }

    public static void exibirAluno() {
        // Implementar lógica para exibir aluno
    }

    public static void listarAlunos() {
        // Implementar lógica para listar alunos
    }

    public static void mensagemDeSaida() {
        System.out.println("Obrigado por utilizar o Chapéu Seletor de Hogwarts!");
    }

    public static void menu() {
        System.out.println("Bem-vindo ao sistema de seleção de casas de Hogwarts!");
    }

   //Metodo que e chamado na main para executar o programa...
    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            verificarOpcao(op);
        } while (op != 0);
    }
}
