package main.java.hr.java.covidportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@AllArgsConstructor
@Data
public class Lijecnik {

    String domZdravlja;
    Osoba[] osoba;

    @Override
    public String toString() {
        return "Lijecnik{" +
                "domZdravlja='" + domZdravlja + '\'' +
                ", osoba=" + Arrays.toString(osoba) +
                '}';
    }

}
