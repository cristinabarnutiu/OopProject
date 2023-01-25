import java.util.ArrayList;
import java.util.HashMap;

public class StructuriDeDate {
    public static void main(String[] args) {
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.set(0,"First-updated");
        listaNoastra.add("Third");
        //listaNoastra.remove(0);
        System.out.println(listaNoastra.indexOf("Second"));
        for (String value: listaNoastra){
            System.out.println(value);
        }

        HashMap <Integer,String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3,"Third");
        dictionarulNostru.replace(1,"First-updated");
        System.out.println(dictionarulNostru.entrySet());

        HashMap <String,Boolean> cineTreceExamenul = new HashMap<>();
        cineTreceExamenul.put("Pavel",true);
        cineTreceExamenul.put("Flavia",false);
        cineTreceExamenul.put("Mihai", false);
        cineTreceExamenul.put("Sebi", true);
        cineTreceExamenul.put("Mihnea", true);

//        cineTreceExamenul.forEach((k,v)->{
//            if (v){System.out.println(k);}
//        });
//
        for (String cursant : cineTreceExamenul.keySet()) {
            if(cineTreceExamenul.get(cursant))   {
            System.out.println("key: "+ cursant+" value: "+cineTreceExamenul.get(cursant));}
            }





    }


}
