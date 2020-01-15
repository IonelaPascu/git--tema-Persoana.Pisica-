package encapsulation;

public class PersoanaRunner {
    public static void main(String[] args) {
        Persoana gicu = new Persoana ("Gicu", 1910216222333L);

        String numeleGicu = gicu.getNumePersoana();
        System.out.println(numeleGicu);

        System.out.println(gicu.numePersoana);

        long cnpReal = gicu.getCnpPersoana(true);
        long cnpNotAllowed = gicu.getCnpPersoana(false);
        System.out.println(cnpReal);
        System.out.println(cnpNotAllowed);

        String numePisica = "Pisi";
        String numeProprietar = gicu.getNumePersoana();

//        Pisica pisi = new Pisica(numePisica,numeProprietar);
//        Persoana myAnimal = new Persoana("Ana", 2910216222444L);
//        pisi.setProprietar(myAnimal);
//        pisi.setProprietar(gicu);

    }
}
