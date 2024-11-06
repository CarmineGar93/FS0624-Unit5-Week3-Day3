package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities3;

public class Maggiore extends Ufficiale{
    public Maggiore(Ufficiale nextUfficiale, int salario) {
        super(nextUfficiale, salario);
    }

    @Override
    protected void mansione() {
        System.out.println("Sono un maggiore e mi piace il dolore");
    }
}
