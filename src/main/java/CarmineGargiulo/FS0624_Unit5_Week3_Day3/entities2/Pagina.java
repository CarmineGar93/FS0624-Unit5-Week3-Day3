package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2;

public class Pagina implements Stampato{
    @Override
    public void stampa() {
        System.out.println("Sto stampando la pagina");
    }

    @Override
    public int count() {
        return 1;
    }
}
