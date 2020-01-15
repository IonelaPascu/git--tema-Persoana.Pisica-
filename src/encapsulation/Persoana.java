package encapsulation;

public class Persoana {
    public String numePersoana;
    private long cnpPersoana;
    private char gen;

    public Persoana(String numePersoana, long cnpPersoana) {
        this.numePersoana = numePersoana;
        this.cnpPersoana = cnpPersoana;
    }

    public Persoana() {
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public long getCnpPersoana(boolean canReadCnp) {
        if (canReadCnp == true) {
            return cnpPersoana;
        }
        return 0;
    }
}
