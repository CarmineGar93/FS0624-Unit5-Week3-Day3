package CarmineGargiulo.FS0624_Unit5_Week3_Day3.runners;

import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities.Info;
import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities.InfoAdapter;
import CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities.UserData;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;

@Component
@Order(1)
public class Esercizio1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------ESERCIZIO 1----------");
        UserData userData = new UserData();
        Info info = new Info("Carmine", "Gargiulo", LocalDate.parse("1993-02-19"));
        InfoAdapter infoAdapter = new InfoAdapter(info);
        userData.getData(infoAdapter);
        userData.showData();
    }
}
