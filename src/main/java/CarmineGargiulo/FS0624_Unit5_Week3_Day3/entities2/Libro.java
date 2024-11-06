package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Libro implements Stampato{
    private List<String> autori;
    private double price;
    private List<Stampato> stampatoList = new ArrayList<>();

    public Libro(List<String> autori, double price) {
        this.autori = autori;
        this.price = price;
    }

    public void addStampato(Stampato s){
        if (s instanceof Libro) System.out.println("Forbidden");
        else stampatoList.add(s);
    }

    @Override
    public void stampa() {
        System.out.println("Sto stampando il libro");
        stampatoList.forEach(Stampato::stampa);
    }

    @Override
    public int count() {
        return stampatoList.stream().mapToInt(Stampato::count).sum();
    }


}
