import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String>sozluk = new HashMap<String ,String>();
        sozluk.put("Book","Kitap");
        sozluk.put("Table","Masa");
        sozluk.put("Computer","Bilgisayar");
        //sozluk.remove("Table");
        for(String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        System.out.println(sozluk.get("Table"));
    }
}
