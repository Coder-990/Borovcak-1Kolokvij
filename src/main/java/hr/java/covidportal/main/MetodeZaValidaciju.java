package main.java.hr.java.covidportal.main;


import main.java.hr.java.covidportal.model.Lijecnik;

import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

import static main.java.hr.java.covidportal.main.Glavna.BROJ_LIJECNIKA;

public class MetodeZaValidaciju {

    // DRUGI DODATNI ZADATAK
    protected static String proveraIstogDomaZdravlja(Scanner scan, Lijecnik[] lijecnici) {

        boolean postojiDomZdravlja;
        String inputString = "";
        do {
            postojiDomZdravlja = false;
            inputString = scan.nextLine().toUpperCase();
            if (lijecnici!= null) {
                for (int i = 0; i < lijecnici.length; i++) {
                    if (lijecnici[i]!= null && lijecnici[i].getDomZdravlja().equals(inputString)) {
                        postojiDomZdravlja = true;
                    }
                }
            }
            if (postojiDomZdravlja) {
                System.out.print("Naziv takvog doma zdravlja vec postoji, ponovite unos: ");
            }
        } while (postojiDomZdravlja);
        return inputString;

    }

    protected static String provjeraPraznogStringaBroja(Scanner scan) {

        String inputString;
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        do {
            inputString = scan.nextLine().trim();
            if (inputString.isBlank() || pattern.matcher(inputString).matches()) {
                System.out.print("Pokusali ste unijeti prazan string ili broj, ponovite unos: ");
            }
        } while (inputString.isBlank() || pattern.matcher(inputString).matches());

        return inputString;
    }

    protected static Integer provjeraNegativnogIntegera(Scanner scan) {

        Integer inputInt;

        do {
            inputInt = scan.nextInt();
            scan.nextLine();
            if (inputInt < 0 || inputInt.equals(0)) {
                System.out.print("Pokusali ste unijeti negativan broj, ponovite unos: ");
            }
        } while (inputInt < 0 || inputInt.equals(0));

        return inputInt;
    }

    protected static Integer provjeraBrojaSaListe(Scanner scan, Integer granica) {

        Integer odabir = 0;
        do {
            odabir = MetodeZaValidaciju.provjeraNegativnogIntegera(scan);
            if (odabir < 0 || odabir > granica)
                System.out.print("Odabir mora biti redni broj sa ponudene liste, ponovite unos: ");
        } while (odabir < 0 || odabir > granica);

        return odabir;
    }

}
