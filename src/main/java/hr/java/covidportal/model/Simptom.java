package main.java.hr.java.covidportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Simptom {

    String naziv, vrijednost;

    /*
    public Simptom(String naziv, String vrijednost) {
        this.naziv = naziv;
        this.vrijednost = vrijednost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

     */
}
