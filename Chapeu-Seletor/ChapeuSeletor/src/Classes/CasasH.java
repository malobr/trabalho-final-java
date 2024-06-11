package Classes;

import Interfaces.Casas;

public abstract class CasasH   extends Aluno implements Casas{

    @Override
    public String Sonserina(){
        return "\nParabens " + getNome() + " Voce teve a sorte de entrar para a melhor casa do mundo, a SONSERINA!!";
    }

    @Override
    public String Grifinoria(){
        return "\nParabens " + getNome() + " Voce foi selecionado para a Grifinoria";
    }

    @Override
    public String Corvinal(){
        return "\nParabens " + getNome() + " Voce foi selecionado para a Corvinal";
    }

    @Override
    public String LufaLufa(){
        return "\nParabens " + getNome() + " Voce foi selecionado para a LufaLufa";


}
}
