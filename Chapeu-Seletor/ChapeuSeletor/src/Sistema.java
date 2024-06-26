import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Casas.Corvinal;
import Casas.Grifinoria;
import Casas.LufaLufa;
import Casas.Sonserina;
import Classes.Aluno;
import Interfaces.Casas;

public class Sistema {

    private static Scanner scanner = new Scanner(System.in);

    private static void exibirMenu() {
        chapeuSeletor();
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
        try {
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
                case 5: // Atualizar Aluno
                    atualizar();
                    break;
                case 0: // Sair
                    mensagemDeSaida();
                    break;
                default:
                    System.out.println("\nOpção inválida.... Digite novamente...");
                    break;
            }
        } catch (Exception e) {
            System.out.println("\nErro ao processar a opção: " + e.getMessage());
        }
    }

    public static void cadastrarNovoAluno() {
        try {
            int grifinoria = 0;
            int sonserina = 0;
            int corvinal = 0;
            int lufalufa = 0;

            System.out.println("\nBem-vindo ao Chapéu Seletor de Hogwarts!");
            
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
            
            System.out.println("\nResponda às seguintes perguntas para descobrir sua casa.");
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

            Aluno aluno = new Aluno(matricula, nome, idade, sexo, statusDeSangue, casa);
            try {
                GerenciadorAluno.salvarAluno(aluno);
                System.out.println("\nAluno cadastrado com sucesso!");
            } catch (IOException e) {
                System.out.println("\nErro ao salvar aluno: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("\nErro ao cadastrar aluno: " + e.getMessage());
        }
    }

    private static void removerAluno() {
        try {
            System.out.println("\nInforme a Matricula do Aluno a ser excluído:");
            String matricula = scanner.nextLine();
            GerenciadorAluno.apagarAluno(matricula);
            System.out.println("\nAluno excluído com sucesso! Avada Kedavra!!!!!");
        } catch (Exception e) {
            System.out.println("\nErro ao remover aluno: " + e.getMessage());
        }
    }

    public static void exibirAluno() {
        try {
            System.out.println("\nInforme a matrícula do aluno:");
            String matricula = scanner.nextLine();
            Aluno aluno = GerenciadorAluno.buscarAluno(matricula);
            System.out.println(aluno);
        } catch (Exception e) {
            System.out.println("\nErro ao exibir aluno: " + e.getMessage());
        }
    }

    private static void listarAlunos() {
        try {
            ArrayList<Aluno> alunos = GerenciadorAluno.getListaAlunos();
            if (alunos.isEmpty()) {
                System.out.println("\nNão há Alunos Matriculados.");
            } else {
                System.out.println("\nLista de Alunos:\n");
                for (Aluno aluno : alunos) {
                    System.out.println(aluno);
                }
            }
        } catch (Exception e) {
            System.out.println("\nErro ao listar alunos: " + e.getMessage());
        }
        enterParaSeguir();
    }

    private static void atualizar() {
        try {
            System.out.println("\nAtualizar dados do Aluno");

            System.out.println("Informe a matricula do aluno:");
            String matricula = scanner.nextLine();

            Aluno tempAluno = GerenciadorAluno.buscarAluno(matricula);

            System.out.println("Informe o novo nome:");
            String nome = scanner.nextLine();
            System.out.println("Informe a nova Idade:");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha restante
            //System.out.println("Informe o novo sexo:");
            //String sexo = scanner.nextLine();
            System.out.println("Informe o status de sangue:");
            String statusDeSangue = scanner.nextLine();

            tempAluno.setNome(nome);
            tempAluno.setIdade(idade);
            //tempAluno.setSexo(sexo);
            tempAluno.setStatusDeSangue(statusDeSangue);

            GerenciadorAluno.atualizarAluno(tempAluno);

            System.out.println("\nAluno " + matricula + " atualizado com sucesso!");

        } catch (Exception e) {
            System.out.println("\nErro ao atualizar aluno: " + e.getMessage());
        }
    }

    private static void mensagemDeSaida() {
        System.out.println("\nO Chapéu Seletor cansou... (Programa Finalizado)");
        System.out.println("\n");
        System.out.println("─▄▀─▄▀         JJJJJJJ     AAAAA     V       V      AAAAA       ─▄▀─▄▀    ");
        System.out.println("──▀──▀             J      A     A     V     V      A     A      ──▀──▀    ");
        System.out.println("█▀▀▀▀▀█▄           J      AAAAAAA      V   V       AAAAAAA      █▀▀▀▀▀█▄  ");
        System.out.println("█░░░░░█─█    J     J      A     A       V V        A     A      █░░░░░█─█ ");
        System.out.println("▀▄▄▄▄▄▀▀      JJJJJ       A     A        V         A     A      ▀▄▄▄▄▄▀▀  ");
        System.out.println("");
        System.out.println("          ");
        System.out.println("        /フ---フ");
        System.out.println("       |  _  _ |");
        System.out.println("      /` ミ_x )");
        System.out.println("     /      |");
        System.out.println("    /  ヽ   ﾉ");
        System.out.println("    │  | | |");
        System.out.println(" ／￣    | | |");
        System.out.println(" | (￣ヽ__ヽ_)__)");
        System.out.println(" (__二つ");
    }

    private static void chapeuSeletor(){
        System.out.println("--──────--▄▀▀▄");
        System.out.println("---──────▄▀▄░▀▄");
        System.out.println("--──────▄▀▄░░░░▀▄");
        System.out.println("--──────▄▀▄░░░░░░▀▄");
        System.out.println("--─────▄█░░░░░░░░░█▄");
        System.out.println("--─▄▄──█░░░░░░░░░░░█──▄▄");
        System.out.println("--█▄▄██░░▀░░░░░░░░▀░░██▄▄█");
        System.out.println("--Chapeu Seletor de Hogwarts--");
    }
        
    public static void enterParaSeguir() {
        System.out.println("\nClique em qualquer tecla para continuar");
        scanner.nextLine();
    }

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
