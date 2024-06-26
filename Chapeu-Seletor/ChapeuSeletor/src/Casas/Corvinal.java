package Casas;

import Interfaces.Casas;


public class Corvinal implements Casas {
    @Override
    public String getNome() {
        return "Corvinal";
    }

    @Override
    public String getDesenho() {
        return "Desenho da Corvinal"; // Desenho específico da Corvinal
    }

}
