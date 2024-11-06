package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
public class InfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return Period.between(info.getDataDiNascita(), LocalDate.now()).getYears();
    }
}
