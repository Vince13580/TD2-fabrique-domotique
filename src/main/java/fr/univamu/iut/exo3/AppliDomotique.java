package fr.univamu.iut.exo3;

import fr.univamu.iut.exo1.Cafetière;
import fr.univamu.iut.exo1.Connectable;
import fr.univamu.iut.exo1.Radio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AppliDomotique {


    public static void main(String[] args) {
        ImprimanteReseau p2 = new ImprimanteReseau();
        ImprimanteLocale p3 = new ImprimanteLocale();
        p2.imprimer();
        p3.imprimer();
        Multifonction.Scanner p4 = new Scanner();
        p4.imprimer();

    }
}
