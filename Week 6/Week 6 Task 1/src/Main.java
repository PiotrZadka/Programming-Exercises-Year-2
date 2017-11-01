import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


            // Arraylists
        ArrayList<String> insects = new ArrayList<String>();

        insects.add("horsefly");
        insects.add("butterfly");
        insects.add("dragonfly");
        insects.add("fly");

        int size = insects.size();
        for (int i=0; i<size; i++) {
            System.out.println("insect " + i + " : " + insects.get(i)); }


            // HashMaps
        HashMap<String,String> phone = new HashMap<String,String>();
        phone.put("John", "3453");
        phone.put("Jenny", "3478");
        phone.put("Richard", "3567");
        phone.put("Helen", "4532");

        String who = "Jenny";
        String number =(String)phone.get(who); System.out.println("\n"+who+ " "+ number);
    }

}
