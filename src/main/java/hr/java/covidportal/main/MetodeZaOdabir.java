package main.java.hr.java.covidportal.main;

import main.java.hr.java.covidportal.model.*;

import java.util.Scanner;

import static main.java.hr.java.covidportal.main.Glavna.*;

public class MetodeZaOdabir {

    protected static String odabirVrijednosti(Scanner scan) {

        String inputString;

        do {
            inputString = scan.nextLine().toUpperCase();
            if ("RIJETKO".equals(inputString) || "SREDNJE".equals(inputString) || "CESTO".equals(inputString)) {
                return inputString;
            } else {
                System.out.print("Unesite jedan od ponudenih odgovora (RIJETKO, SREDNJE ILI CESTO), ponovite unos: ");
            }
        } while (true);

    }
    //PRVI DODATNI ZADATAK
    protected static Lijecnik odabirLijecnika(Scanner scan, Lijecnik[] lijecnici) {

        Integer odabir = 0;
        int i = 0;

        for (Lijecnik lijecnik : lijecnici) {
            System.out.println((i += 1) + ". " + lijecnik.getDomZdravlja());
        }
        System.out.print("Odabir: ");
        odabir = MetodeZaValidaciju.provjeraBrojaSaListe(scan, BROJ_LIJECNIKA);

        Lijecnik odabraniLijecnik = lijecnici[odabir - 1];

        return odabraniLijecnik;
    }

    protected static Simptom odabirSimptoma(Scanner scan, Simptom[] simptomi) {

        Integer odabir = 0;
        int i = 0;

        for (Simptom simptom : simptomi) {
            System.out.println((i += 1) + ". " + simptom.getNaziv() + " - " + simptom.getVrijednost());
        }
        System.out.print("Odabir: ");
        odabir = MetodeZaValidaciju.provjeraBrojaSaListe(scan, BROJ_SIMPTOMA);

        Simptom odabraniSimptom = simptomi[odabir - 1];

        return odabraniSimptom;
    }

    protected static Zupanija odabirZupanije(Scanner scan, Zupanija[] zupanije) {

        Integer odabir = 0;
        int i = 0;

        for (Zupanija zupanija : zupanije) {
            System.out.println((i += 1) + ". " + zupanija.getNazivZupanije());
        }
        System.out.print("Odabir: ");
        odabir = MetodeZaValidaciju.provjeraBrojaSaListe(scan, BROJ_ZUPANIJA);

        Zupanija odabranaZupanija = zupanije[odabir - 1];

        return odabranaZupanija;
    }

    protected static Bolest odabirBolesti(Scanner scan, Bolest[] bolesti) {

        Integer odabir = 0;
        int i = 0;

        for (Bolest bolest : bolesti) {
            System.out.println((i += 1) + ". " + bolest.getNaziv());
        }
        System.out.print("Odabir: ");
        odabir = MetodeZaValidaciju.provjeraBrojaSaListe(scan, BROJ_BOLESTI);

        Bolest odabranaBolest = bolesti[odabir - 1];

        return odabranaBolest;
    }

    protected static Osoba odabirOsobe(Scanner scan, Osoba[] osobe) {

        Integer odabir = 0;
        int i = 0;

        for (Osoba osoba : osobe) {
            if (osoba != null) {
                System.out.println((i += 1) + ". " + osoba.getIme() + " " + osoba.getPrezime());
            }
        }
        System.out.print("Odabir: ");
        odabir = MetodeZaValidaciju.provjeraBrojaSaListe(scan, brojKontaktiranihOsoba(osobe));

        Osoba odabranaOsoba = osobe[odabir - 1];

        return odabranaOsoba;
    }

    protected static Integer brojKontaktiranihOsoba(Osoba[] osobe) {

        Integer brojac = 0;
        for (Osoba osoba : osobe) {
            if (osoba != null) {
                brojac++;
            }
        }
        return brojac;
    }
}
