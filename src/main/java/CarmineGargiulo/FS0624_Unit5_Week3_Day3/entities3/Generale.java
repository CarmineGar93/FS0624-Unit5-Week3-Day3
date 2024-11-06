package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3;

public class Generale extends Ufficiale{
    public Generale(int salario) {
        super(salario);
    }

    @Override
    protected void mansione() {
        System.out.println("Sono generale e sono un'animale");
    }
}
