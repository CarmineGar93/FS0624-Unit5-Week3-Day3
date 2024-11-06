package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    private String nome, cognome;
    private LocalDate dataDiNascita;
}
