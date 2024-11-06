package CarmineGargiulo.FS0624_Unit5_Week3_Day3.runners;

import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Esercizio3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----------Esercizio 3-------------");
        Ufficiale generale = new Generale(5000);
        Ufficiale colonnello = new Colonnello(generale, 4000);
        Ufficiale maggiore = new Maggiore(colonnello, 3000);
        Ufficiale capitano = new Capitano(maggiore, 2000);
        Ufficiale tenente = new Tenente(capitano, 1000);
        tenente.controlloSalario(4500);
        tenente.controlloSalario(6000);
        tenente.controlloSalario(500);
    }
}
