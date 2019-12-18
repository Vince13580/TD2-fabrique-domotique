package fr.univamu.iut.exo3;

public abstract class Imprimante {

    String statut;

    public String GetStatut(){
        return statut;
    }
    private void setStatus(String status) {
        this.statut = status;
    }
    public void imprimer(){
        System.out.println("Je suis une imprimante qui imprime");
    }
}

