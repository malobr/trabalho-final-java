import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Casas.Corvinal;
import Casas.Grifinoria;
import Casas.LufaLufa;
import Casas.Sonserina;
import Classes.Aluno;
import Interfaces.Casas;

public abstract class GerenciadorAluno {

    private static final String ARQUIVO = "alunos.txt";
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();

    static {
        criarArquivoSeNaoExistir();
        try {
            lerArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salvarAluno(Aluno aluno) throws IOException {
        listaAlunos.add(aluno);
        atualizarArquivo();
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static void lerArquivo() throws IOException {
        listaAlunos.clear();

        File arquivo = new File(ARQUIVO);
        if (arquivo.exists()) {
            try (FileReader fReader = new FileReader(arquivo);
                 BufferedReader bReader = new BufferedReader(fReader)) {

                String linha;
                while ((linha = bReader.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (dados.length == 6) {
                        String nome = dados[0];
                        String matricula = dados[1];
                        int idade = Integer.parseInt(dados[2]);
                        String sexo = dados[3];
                        String statusDeSangue = dados[4];
                        String casa = dados[5];

                        // Aqui você precisa ajustar para criar a instância correta da casa (Grifinoria, Sonserina, etc.)
                        Casas casaDoAluno = null;
                        switch (casa) {
                            case "Grifinoria":
                                casaDoAluno = new Grifinoria();
                                break;
                            case "Sonserina":
                                casaDoAluno = new Sonserina();
                                break;
                            case "Corvinal":
                                casaDoAluno = new Corvinal();
                                break;
                            case "LufaLufa":
                                casaDoAluno = new LufaLufa();
                                break;
                            default:
                                System.out.println("Casa não reconhecida.");
                                break;
                        }

                        Aluno tempAluno = new Aluno(nome, matricula, idade, sexo, statusDeSangue, casaDoAluno);
                        listaAlunos.add(tempAluno);
                    } else {
                        System.out.println("Formato de linha inválido: " + linha);
                    }
                }
            }
        }
    }

    private static void atualizarArquivo() throws IOException {
        try (FileWriter fWriter = new FileWriter(ARQUIVO);
             BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Aluno aluno : listaAlunos) {
                bWriter.write(aluno.getNome() + ";" +
                        aluno.getMatricula() + ";" +
                        aluno.getIdade() + ";" +
                        aluno.getSexo() + ";" +
                        aluno.getStatusDeSangue() + ";" +
                        aluno.getCasa().getClass().getSimpleName() + "\n");
            }
        }
    }

    public static void apagarAluno(String matricula) throws Exception {
        boolean encontrado = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                listaAlunos.remove(aluno);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new Exception("Aluno com a matrícula " + matricula + " não encontrado.");
        }

        atualizarArquivo();
    }

    public static void criarArquivoSeNaoExistir() {
        try {
            File arquivo = new File(ARQUIVO);
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    // Método para buscar um aluno por matrícula
    protected static Aluno buscarAluno(String matricula) throws Exception {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        throw new Exception("Aluno com a matrícula " + matricula + " não encontrado.");
    }

    // Método para atualizar um aluno
    public static void atualizarAluno(Aluno alunoAtualizado) throws IOException {
        boolean encontrado = false;
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            if (aluno.getMatricula().equals(alunoAtualizado.getMatricula())) {
                listaAlunos.set(i, alunoAtualizado);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new IOException("Aluno não encontrado para atualização.");
        }

        atualizarArquivo();
    }
}

