package Casas;

import Interfaces.Casas;


public class LufaLufa implements Casas {
    @Override
    public String getNome() {
        return "Lufa-Lufa";
    }

    @Override
    public String getDesenho() {
        return "Desenho da Lufa-Lufa"; // Desenho específico da Lufa-Lufa
    }
}
