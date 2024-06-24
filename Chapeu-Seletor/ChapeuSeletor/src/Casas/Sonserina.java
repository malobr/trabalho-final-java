package Casas;

import Interfaces.Casas;



public class Sonserina implements Casas {
    @Override
    public String getNome() {
        return "Sonserina";
    }

    @Override
    public String getDesenho() {
        return "Desenho da Sonserina"; // Desenho específico da Sonserina
    }
}


