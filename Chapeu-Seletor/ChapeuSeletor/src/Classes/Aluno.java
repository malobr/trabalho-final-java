package Classes;

import Interfaces.Casas;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private String sexo;
    private String statusDeSangue;
    private Casas casa; // Adicionar atributo para a casa do aluno

    public Aluno(){

    }
    // Construtor
    public Aluno(String matricula, String nome, int idade, String sexo, String statusDeSangue, Casas casa) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.statusDeSangue = statusDeSangue;
        this.casa = casa; // Atribuir a casa passada como parâmetro
    }

    // Getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // Método para retornar a casa do aluno
    public Casas getCasa() {
        return this.casa;
    }

    // Sobrescrever o método toString para representação textual do aluno
    @Override
    public String toString() {
        System.out.println("\n-- Aluno(A) de Hogwarts --");
        return " Nome: " + nome + "," + "\n Matrícula: " + matricula + "," + "\n Idade: " + idade + "," +"\n Sexo: " + sexo
                + "," + "\n Status de Sangue: " + statusDeSangue + "," + "\n Casa: " + casa.getNome() + "," + "\n\n" + casa.getDesenho();
    }

    // Método para inicializar os dados do aluno a partir de uma string formatada
    public void fromString(String str) {
        String[] parts = str.split(",");
        this.nome = parts[0];
        this.matricula = parts[1];
        this.idade = Integer.parseInt(parts[2]);
        this.sexo = parts[3];
        this.statusDeSangue = parts[4];
        // Aqui você precisa atribuir a casa corretamente, dependendo da implementação da interface Casas
        // Exemplo: this.casa = new CasaXXX(parts[5]); // Ajuste conforme a implementação de Casas
    }
}
