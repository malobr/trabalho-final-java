package Casas;

import Interfaces.Casas;



public class Sonserina implements Casas {
    @Override
    public String getNome() {
        return "Sonserina";
    }

    @Override
    public String getDesenho() {
        return "▄▄▀█▄───▄───────▄\n" +
               "▀▀▀██──███─────███\n" +
                "░▄██▀░█████░░░█████░░\n" +
                "███▀▄███░███░███░███░▄\n" +
                "▀█████▀░░░▀███▀░░░▀██▀\n";
        }
    }



