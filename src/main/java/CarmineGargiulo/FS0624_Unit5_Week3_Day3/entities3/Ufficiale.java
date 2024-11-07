package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class Ufficiale {
    protected Ufficiale nextUfficiale;
    protected int salario;

    public Ufficiale(Ufficiale nextUfficiale, int salario) {
        this.nextUfficiale = nextUfficiale;
        this.salario = salario;
    }

    public Ufficiale(int salario){
        this.salario = salario;
    }

    protected abstract void mansione();
    public void controlloSalario(int tetto){
        System.out.println("Controllo se da " + this.getClass().getSimpleName() + " prendo il salario inserito di " + tetto);
        if(tetto <= this.salario) System.out.println("Affermativo");
        else if(nextUfficiale != null){
            System.out.println("Negativo :( Passo la palla al mio superiore");
            nextUfficiale.controlloSalario(tetto);
        }
        else System.out.println("Ma quanto pensi che prendano gli ufficiali?");
    }

    public void controllaSuperiore(){
        if (nextUfficiale != null) System.out.println("Il mio superiore è: " + nextUfficiale.getClass().getSimpleName());
        else System.out.println("Sono il boss degli ufficiali");
    }
}
