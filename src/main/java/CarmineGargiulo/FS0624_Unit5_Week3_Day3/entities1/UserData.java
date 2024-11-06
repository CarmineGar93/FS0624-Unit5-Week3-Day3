package CarmineGargiulo.FS0624_Unit5_Week3_Day3.entities1;



public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    public void showData(){
        System.out.println("Nominativo: " + nomeCompleto);
        System.out.println("Età: " + eta);
    }
}
