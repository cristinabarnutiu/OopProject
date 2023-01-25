public class SmartphoneAndroid extends Smartphone{
    public SmartphoneAndroid(String marca, int pret) {
        super(marca, pret);
    }

    public void porneste(){
        System.out.println("Telefonul Android porneste");
    };

    public void metodaCuCampDinClasaParinte(){
        System.out.println("Marca este "+super.marca+" si pretul este "+super.pret);
    }
}
