package Classes;

import java.util.ArrayList;
import java.util.List;


//import Classes.Aluno;

public class Cadastro {
    private static List <Aluno> listaAlunos = new ArrayList<>();
    public static Object getListaAlunos;

    

    //Método que adiciona aluno a lista
    public static void cadastrar(Aluno aluno){
        listaAlunos.add(aluno);
    }

    //Método para buscar aluno na lista usando sua matricula
    public static Aluno buscar(String matricula){
        
        //Passando por todas os alunos da lista
        for (Aluno alunoTemporario : listaAlunos){
            
            //Testando se o aluno existe e comparando sua matricula
            if (alunoTemporario.getMatricula() == matricula) {
                //Aluno encontrado, então retornamos ele...
                return alunoTemporario;
            }
        }
        //Se o funciionario não for encontrada retornaremos nulo
        return null; 
    }
    public static List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

}
