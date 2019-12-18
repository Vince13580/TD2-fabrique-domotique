package fr.univamu.iut.exo3;

public abstract class Multifonction extends Imprimante{

    public void imprimer(){
        System.out.println("Je suis une imprimante qui imprime équipée avec un" + this.GetStatut());
    }
    public class Scanner extends Multifonction{
        private String statut= "scanner";
        public void scanner(){
            System.out.println("Je scanne ...");
        }
    }
}
