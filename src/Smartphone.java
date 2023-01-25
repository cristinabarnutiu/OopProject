public class Smartphone extends Device implements ObiectElectronic{
    protected String marca = "no name";
    protected int pret = 100;

    public Smartphone(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public void porneste(){
        System.out.println("Telefonul porneste");
    };
    public void seOpreste(){
        System.out.println("Telefonul se opreste");
    };

    @Override
    public boolean eConectat() {
        return false;
    }
}
