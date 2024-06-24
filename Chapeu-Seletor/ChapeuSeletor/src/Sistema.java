import java.util.Scanner;

import Classes.*;

import Interfaces.Casas;

import Casas.Grifinoria;
import Casas.Sonserina;
import Casas.Corvinal;
import Casas.LufaLufa;

public class Sistema {

    private static Scanner scanner = new Scanner(System.in);

    private static void exibirMenu() {
        menu();
        System.out.println("\n");
        System.out.println("[1] Cadastrar Aluno");
        System.out.println("[2] Remover Aluno");
        System.out.println("[3] Exibir Aluno");
        System.out.println("[4] Listar todos os Alunos");
        System.out.println("[5] Atualizar Aluno");
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

        System.out.println("\nBem-vindo ao Chapéu Seletor de Hogwarts!");
        System.out.println("\nResponda às seguintes perguntas para descobrir sua casa.");

        System.out.println("\nInforme seu nome:");
        String nome = scanner.nextLine();

        System.out.println("\nInforme sua matrícula:");
        String matricula = scanner.nextLine();

        System.out.println("\nInforme sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha restante

        System.out.println("\nInforme seu sexo:");
        String sexo = scanner.nextLine();

        System.out.println("\nInforme seu Status de Sangue (Puro ou Trouxa):");
        String statusDeSangue = scanner.nextLine();

        // Pergunta 1
        System.out.println("\nPergunta 1: Qual dessas qualidades você mais valoriza?");
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
        System.out.println("\nPergunta 2: Qual dessas criaturas mágicas você prefere?");
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
        System.out.println("\nPergunta 3: Qual dessas matérias você mais gosta?");
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
        System.out.println("\nPergunta 4: Qual desses lugares você preferiria explorar?");
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
        System.out.println("\nPergunta 5: Qual dessas palavras melhor descreve você?");
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
        Casas casa;
        if (grifinoria >= sonserina && grifinoria >= corvinal && grifinoria >= lufalufa) {
            casa = new Grifinoria();
        } else if (sonserina >= grifinoria && sonserina >= corvinal && sonserina >= lufalufa) {
            casa = new Sonserina();
        } else if (corvinal >= grifinoria && corvinal >= sonserina && corvinal >= lufalufa) {
            casa = new Corvinal();
        } else {
            casa = new LufaLufa();
        }

        Aluno aluno = new Aluno(nome, matricula, idade, sexo, statusDeSangue, casa);
        Cadastro.cadastrar(aluno);
    }

    private static void removerAluno(){
        System.out.println("\nInforme a Matricula do Aluno a ser excluído:");
        String matricula = scanner.nextLine();
        for (Aluno aluno : Cadastro.getListaAlunos()) {
            if (aluno.getMatricula().equals(matricula)) {
                Cadastro.getListaAlunos().remove(aluno);
                System.out.println("\nAluno excluído com sucesso!\n Avada Kadavra!!!!!");
                enterParaSeguir();
                return;
            }
        }
        System.out.println("\nAluno não encontrado.");
    }

    public static void exibirAluno() {
        System.out.println("\nInforme a matrícula do aluno:");
        String matricula = scanner.nextLine();
        Aluno aluno = Cadastro.buscarPorMatricula(matricula);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("\nAluno não encontrado.");
        }
    }

    private static void listarAlunos() {
        if (Cadastro.getListaAlunos().isEmpty()) {
            System.out.println("\nNão há Alunos Matriculados.");
        } else {
            System.out.println("\nLista de Alunos:\n");
            for (Aluno aluno : Cadastro.getListaAlunos()) {
                System.out.println(aluno.toString());

            }
        }
            enterParaSeguir();
        }

        /*private static void atualizar() {

            System.out.println("\nAtualizar  dados do Aluno");
    
            int matricula = Console.lerInt("Informe a matricula do aluno:");
    
            try {
    
                Aluno tempAluno = Cadastro.buscarPorMatricula(matricula);
    
                String marca = Console.lerString("Informe a nova marca:");
                String nome = Console.lerString("Informe o novo nome:");
                String tipo = Console.lerString("Informe o novo tipo:");
    
                tempRelogio.setMarca(marca);
                tempRelogio.setNome(nome);
                tempRelogio.setTipo(tipo);
    
                Cadastro.atualizarRelogio(tempAluno);
    
                System.out.println("\nAluno(A) " + matricula + " atualizado(A) com sucesso!");
    
            } catch (Exception e) {
    
                System.out.println(e.getMessage());
            }
    
        }*/

        private static void mensagemDeSaida(){
            System.out.println("\nO Chapeu Seletor cansou...(Programa Finalizado)");
            System.out.println("\n");
            System.out.println("─▄▀─▄▀         JJJJJJJ     AAAAA     V       V      AAAAA       ─▄▀─▄▀    ");
            System.out.println("──▀──▀             J      A     A     V     V      A     A      ──▀──▀    ");
            System.out.println("█▀▀▀▀▀█▄           J      AAAAAAA      V   V       AAAAAAA      █▀▀▀▀▀█▄  ");
            System.out.println("█░░░░░█─█    J     J      A     A       V V        A     A      █░░░░░█─█ ");
            System.out.println("▀▄▄▄▄▄▀▀      JJJJJ       A     A        V         A     A      ▀▄▄▄▄▄▀▀  ");
            System.out.println("");
            System.out.println("──────--▄▀▀▄");
            System.out.println("──────▄▀▄░▀▄");
            System.out.println("──────▄▀▄░░░░▀▄");
            System.out.println("──────▄▀▄░░░░░░▀▄");
            System.out.println("─────▄█░░░░░░░░░█▄");
            System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
            System.out.println("█▄▄██░░▀░░░░░░░░▀░░██▄▄█");
            System.out.println("-------------------------");
            
            }

    public static void menu() {
        System.out.println("──────--▄▀▀▄");
        System.out.println("──────▄▀▄░▀▄");
        System.out.println("──────▄▀▄░░░░▀▄");
        System.out.println("──────▄▀▄░░░░░░▀▄");
        System.out.println("─────▄█░░░░░░░░░█▄");
        System.out.println("─▄▄──█░░░░░░░░░░░█── ▄▄");
        System.out.println("█▄▄██░░▀░░░░░░░░▀░░██▄▄█");
        System.out.println("-------------------------");
        System.out.println("Bem-vindo ao Chapeu Seletor de Hogwarts!");

    }

    public static void enterParaSeguir() {
        System.out.println("\nClique em qualquer tecla para continuar");
        scanner.nextLine();
    }

    // Método que é chamado na main para executar o programa...
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
