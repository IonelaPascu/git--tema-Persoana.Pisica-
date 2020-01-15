package encapsulation;

public class Pisica {
    private String  numePisica;
    private String numeProprietarPisica;

    public Pisica (String numePisica, String numeProprietarPisica){
        this.numePisica = numePisica;
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public Pisica(){
    }

    public void setNumeProprietar (String numeProprietarPisica){
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public void setProprietar (Persoana proprietar){
        this.numeProprietarPisica = proprietar.getNumePersoana();
    }
}
