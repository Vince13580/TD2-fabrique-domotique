package fr.univamu.iut.exo2;

public class Cafetière implements Connectable{

    public void activer(){
        System.out.println("La cafetière est activée");
    }

    public void equiper(String gadget){
        System.out.println("La cafetière est équipée avec " + gadget);
    }
}
