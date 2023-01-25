import jdk.jfr.StackTrace;

abstract class Sportiv {
    protected String proba;
    protected String tara;

    public Sportiv(String proba, String tara) {
        this.proba = proba;
        this.tara = tara;
    }

    abstract void seAntreneaza();
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    };

}
