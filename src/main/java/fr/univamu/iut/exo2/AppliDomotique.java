package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Cafetière;
import fr.univamu.iut.exo1.Connectable;
import fr.univamu.iut.exo1.Radio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static String menu() {
        System.out.println("Saisir l'appareil que vous voulez activer");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        String choix = input.nextLine();
        return choix;
    }

    public static void connecter(String type) {
        if(type.equals("cafetière")) {
            Cafetière cafet = new Cafetière();
            cafet.activer();
            cafet.equiper("un machin");
        }
        else if(type.equals("radio")){
                Radio radio = new Radio();
                radio.activer();
                radio.equiper("un truc");

        }
        else if(type.equals("radiateur")){
            Radiateur radiateur = new Radiateur();
            radiateur.activer();
            radiateur.equiper("un bidule");

        }
        else {
            System.out.println("Je n'ai pas compris le nom de l'appareil");
        }
    }

    public static void main(String[] args) {
        String type = "";
        while ((type = menu()) != "") {
            connecter(type);
        }
        System.out.println(objets);
    }
}
