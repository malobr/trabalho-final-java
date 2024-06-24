package Classes;

import Interfaces.Casas;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private String sexo;
    private String statusDeSangue;
    private Casas casa;

    public Aluno(String nome, String matricula, int idade, String sexo, String statusDeSangue, Casas casa) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.sexo = sexo;
        this.statusDeSangue = statusDeSangue;
        this.casa = casa;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getStatusDeSangue() {
        return statusDeSangue;
    }

    public Casas getCasa() {
        return casa;
    }

    @Override
    public String toString() {
        System.out.println("-- Aluno(A) de Hogwarts --");
        return " Nome: " + nome + "\n Matrícula: " + matricula + "\n Idade: " + idade + "\n Sexo: " + sexo
                + "\n Status de Sangue: " + statusDeSangue + "\n Casa: " + casa.getNome() + "\n" + casa.getDesenho();
    }
}
