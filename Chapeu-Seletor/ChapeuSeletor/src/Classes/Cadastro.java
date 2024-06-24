package Classes;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Aluno> alunos = new ArrayList<>();

    public static void cadastrar(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void remover(String matricula) {
        Aluno aluno = buscarPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static Aluno buscarPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public static List<Aluno> listarTodos() {
        return new ArrayList<>(alunos); // Retorna uma cópia da lista para evitar modificações externas
    }

    public static List<Aluno> getListaAlunos() {
        return alunos;
    }
}
