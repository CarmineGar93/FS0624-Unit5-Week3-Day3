package CarmineGargiulo.FS0624_Unit5_Week3_Day3.runners;

import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2.Libro;
import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2.Pagina;
import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities2.Sezione;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
public class Esercizio2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------ESERCIZIO 2----------");
        Sezione sezione1 = new Sezione();
        for (int i = 0; i < 10; i++) {
            sezione1.addStampato(new Pagina());
        }
        Sezione sezione2 = new Sezione();
        for (int i = 0; i < 5; i++) {
            sezione2.addStampato(new Pagina());
        }
        Sezione sezione3 = new Sezione();
        for (int i = 0; i < 15; i++) {
            sezione3.addStampato(new Pagina());
        }
        Libro libro = new Libro(List.of("Aldo", "Giovanni", "Giacomo"), 40);
        libro.addStampato(sezione1);
        libro.addStampato(sezione2);
        libro.addStampato(sezione3);
        for (int i = 0; i < 5; i++) {
            libro.addStampato(new Pagina());
        }
        libro.stampa();
        System.out.println("Pagine nel libro: ");
        System.out.println(libro.count());
        System.out.println("Pagine nella sezione 1: ");
        System.out.println(sezione1.count());
        System.out.println("Pagine nella sezione 2: ");
        System.out.println(sezione2.count());
        System.out.println("Pagine nella sezione 3: ");
        System.out.println(sezione3.count());
    }
}
