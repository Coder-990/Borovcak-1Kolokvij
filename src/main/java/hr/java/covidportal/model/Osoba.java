package main.java.hr.java.covidportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@AllArgsConstructor
@Data
public class Osoba {

    String ime, prezime;
    Integer starost;
    Zupanija zupanija;
    Bolest zarazenBolescu;
    Osoba[] kontaktiraneOsobe;

    public Osoba(String ime, String prezime, Integer starost, Zupanija zupanija, Bolest zarazenBolescu) {
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
        this.zupanija = zupanija;
        this.zarazenBolescu = zarazenBolescu;
    }
//    public Osoba(String ime, String prezime, Integer starost, Zupanija zupanija, Bolest zarazenBolescu, Osoba[] kontaktiraneOsobe) {
//        this.ime = ime;
//        this.prezime = prezime;
//        this.starost = starost;
//        this.zupanija = zupanija;
//        this.zarazenBolescu = zarazenBolescu;
//        this.kontaktiraneOsobe = kontaktiraneOsobe;
//    }

    @Override
    public String toString() {
        String kontaktOsoba = (Optional.ofNullable(kontaktiraneOsobe).isPresent() && kontaktiraneOsobe.length > 0) ? Arrays.toString(kontaktiraneOsobe) : "Nema kontaktiranih osoba.";
        return "Osoba: " +
                "\nIme i prezime = " + ime + " " + prezime  +
                "\nStarost = " + starost +
                "\nZupanija prebivalista = " + zupanija.getNazivZupanije() +
                "\nZarazen bolescu = " + zarazenBolescu.getNaziv() +
                "\nKontaktiraneOsobe:\n" + kontaktOsoba +"\n";
    }
    /*

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getStarost() {
        return starost;
    }

    public void setStarost(Integer starost) {
        this.starost = starost;
    }

    public Zupanija getZupanija() {
        return zupanija;
    }

    public void setZupanija(Zupanija zupanija) {
        this.zupanija = zupanija;
    }

    public Bolest getZarazenBolescu() {
        return zarazenBolescu;
    }

    public void setZarazenBolescu(Bolest zarazenBolescu) {
        this.zarazenBolescu = zarazenBolescu;
    }

    public Osoba getKontaktiraneOsobe() {
        return kontaktiraneOsobe;
    }

    public void setKontaktiraneOsobe(Osoba kontaktiraneOsobe) {
        this.kontaktiraneOsobe = kontaktiraneOsobe;
    }
    */
}
