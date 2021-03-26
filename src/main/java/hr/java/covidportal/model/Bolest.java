package main.java.hr.java.covidportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Bolest {

    String naziv;
    Simptom[] simptomi;

    /*
    public Simptom[] getSimptomi() {
        return simptomi;
    }

    public void setSimptomi(Simptom[] simptomi) {
        this.simptomi = simptomi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    */
}
