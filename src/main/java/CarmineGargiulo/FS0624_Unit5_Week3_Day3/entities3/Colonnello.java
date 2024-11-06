package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3;

public class Colonnello extends Ufficiale{
    public Colonnello(Ufficiale nextUfficiale, int salario) {
        super(nextUfficiale, salario);
    }

    @Override
    protected void mansione() {
        System.out.println("Sono un colonnello e bevo tavernello");
    }
}
