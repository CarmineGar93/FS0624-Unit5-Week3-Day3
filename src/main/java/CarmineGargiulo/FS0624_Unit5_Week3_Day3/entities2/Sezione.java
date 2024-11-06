package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Stampato{
    private List<Stampato> stampatoList = new ArrayList<>();

    @Override
    public void stampa() {
        System.out.println("-----Sto stampando la sezione-------");
        stampatoList.forEach(Stampato::stampa);
        System.out.println("------Fine sezione------");
    }

    @Override
    public int count() {
        return stampatoList.stream().mapToInt(Stampato::count).sum();
    }

    public void addStampato(Stampato s){
        if(s instanceof Libro) System.out.println("Forbidden");
        else stampatoList.add(s);
    }
}
