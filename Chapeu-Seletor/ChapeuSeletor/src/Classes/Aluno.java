package Classes;

import Interfaces.Casas;

public  abstract class Aluno implements Casas{

    private String nome;
    private String matricula;
    private int idade;
    private String sexo;
    private String statusDeSangue;
    
    
    public Aluno(){}
    
    public Aluno(String nome, String matricula, int idade, String sexo, String statusDeSangue) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.sexo = sexo;
        this.statusDeSangue = statusDeSangue;
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatusDeSangue() {
        return statusDeSangue;
    }
    public void setStatusDeSangue(String statusDeSangue) {
        this.statusDeSangue = statusDeSangue;
    }

    @Override
    public String toString() {
        //System.out.println(getCasa());
        System.out.println("---Aluno---");
        return super.toString() + "\nNome: " + nome + "\nMatricula: " + matricula + "\nIdade: " + idade + "\nSexo: " + sexo + "\nStatus de Sangue: " ;
    }



}
