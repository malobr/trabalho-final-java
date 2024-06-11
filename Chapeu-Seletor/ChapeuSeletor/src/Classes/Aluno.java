package Classes;

import Interfaces.Casas;

public  abstract class Aluno implements Casas{

    private String nome;
    private int idade;
    private boolean sexo;
    private String statusDeSangue;
    
    
    public Aluno(){}
    
    public Aluno(String nome, int idade, boolean sexo, String statusDeSangue) {
        this.nome = nome;
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

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
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
        return super.toString() + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nStatus de Sangue: " ;
    }


}
