package Casas;

import Interfaces.Casas;


public class Corvinal implements Casas {
    @Override
    public String getNome() {
        return "Corvinal";
    }

    @Override
    public String getDesenho() {
        return "                __\n" +
        "               /'{>\n" +
        "           ____) (____\n" +
        "         //'--;   ;--'\\\\\n" +
        "        ///////\\_/\\\\\\\\\\\\\n" +
        "                m m";
}// Desenho específico da Corvinal
    

}
