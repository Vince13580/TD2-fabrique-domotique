package fr.univamu.iut.exo2;

public class Radiateur implements Connectable{
    @Override
    public void activer() {
        System.out.println("Radiateur activé");
    }

    @Override
    public void equiper(String gadget) {
        System.out.println("radiateur équipé avec " + gadget);
    }
}
