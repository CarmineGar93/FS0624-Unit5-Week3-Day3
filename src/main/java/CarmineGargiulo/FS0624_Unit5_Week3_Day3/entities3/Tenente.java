package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3;

public class Tenente extends Ufficiale{
    public Tenente(Ufficiale nextUfficiale, int salario) {
        super(nextUfficiale, salario);
    }

    @Override
    protected void mansione() {
        System.out.println("Sono un tenente e sono intelligente");
    }
}
