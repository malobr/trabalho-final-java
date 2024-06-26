package Casas;

import Interfaces.Casas;

public class Grifinoria implements Casas {
    @Override
    public String getNome() {
        return "Grifinória";
    }

    @Override
    public String getDesenho() {
        return   "──▄▀▀▀▀▀───▄█▀▀▀█▄\n" +
                "──▐▄▄▄▄▄▄▄▄██▌▀▄▀▐██\n" +
                "──▐▒▒▒▒▒▒▒▒███▌▀▐███\n" +
                "───▌▒▓▒▒▒▒▓▒██▌▀▐██\n" +
                " ───▌▓▐▀▀▀▀▌▓─▀▀";
    }
}
