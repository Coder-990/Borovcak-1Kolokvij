package main.java.hr.java.covidportal.main;

import main.java.hr.java.covidportal.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Glavna {

    protected static final int BROJ_ZUPANIJA = 3;
    protected static final int BROJ_SIMPTOMA = 3;
    protected static final int BROJ_BOLESTI = 3;
    protected static final int BROJ_OSOBA = 3;
    protected static int BROJ_LIJECNIKA = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Zupanija[] zupanije = new Zupanija[BROJ_ZUPANIJA];
        Simptom[] simptomi = new Simptom[BROJ_SIMPTOMA];
        Bolest[] bolesti = new Bolest[BROJ_BOLESTI];
        Osoba[] osobe = new Osoba[BROJ_OSOBA];
        Lijecnik[] lijecnici;

        System.out.println("Unesite podatke o " + BROJ_ZUPANIJA + " zupanije!");
        for (int i = 0; i < BROJ_ZUPANIJA; i++) {
            zupanije[i] = MetodeZaUnosPodataka.unosZupanije(scan, i);
        }

        System.out.println("Unesite podatke o " + BROJ_SIMPTOMA + " simptoma!");
        for (int i = 0; i < BROJ_SIMPTOMA; i++) {
            simptomi[i] = MetodeZaUnosPodataka.unosSimptoma(scan, i);
        }

        System.out.println("Unesite podatke o " + BROJ_BOLESTI + " bolesti!");
        for (int i = 0; i < BROJ_BOLESTI; i++) {
            bolesti[i] = MetodeZaUnosPodataka.unosBolesti(scan, simptomi, i);
        }

        System.out.println("Unesite podatke o " + BROJ_OSOBA + " osobe!");
        for (int i = 0; i < BROJ_OSOBA; i++) {
            osobe[i] = MetodeZaUnosPodataka.unosOsobe(scan, zupanije, bolesti, osobe, i);
        }

        //PRVI DODATNI ZADATAK
        System.out.println("Unesite broj lijecnika: ");
        BROJ_LIJECNIKA = MetodeZaValidaciju.provjeraNegativnogIntegera(scan);
        lijecnici = new Lijecnik[BROJ_LIJECNIKA];
        for (int i = 0; i < lijecnici.length; i++){
            lijecnici[i]=MetodeZaUnosPodataka.unosLijecnika(scan, osobe, lijecnici, i);
        }

        Lijecnik lijecnikMaxOsoba = lijecnici[0];
        int maxOsoba = lijecnikMaxOsoba.getOsoba().length;

        for (Lijecnik lijecnik : lijecnici) {

            if (lijecnik.getOsoba().length > maxOsoba){
                lijecnikMaxOsoba = lijecnik;
                maxOsoba = lijecnik.getOsoba().length;
            }
        }

        System.out.println("Popis lijecnika i osoba: ");
        for (int i = 0; i < lijecnici.length; i++) {
            System.out.println(lijecnici[i].toString());
        }

        System.out.println("\nLijecnik s najvise pacijenata: " + lijecnikMaxOsoba.getDomZdravlja() + ", a ima " + maxOsoba + " osoba.");
        
        scan.close();

    }
}
