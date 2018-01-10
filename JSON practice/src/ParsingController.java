import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.parser.JSONParser;

public class ParsingController {
    public static void main(String[] args) {
        String myJson = "[{\"name\":\"Mohammed Kaleem\",\"email\":\"m.kaleem@mmu.ac.uk\"},{\"name\":\"Alan Crispin\",\"email\":\"a.crispin@mmu.ac.uk\"},{\"name\":\"Keeley Crockket\",\"email\":\"k.crokket@mmu.ac.uk\"}]\r\n";
        JsonParser jsonParser = new JsonParser();
        System.out.println(myJson);

        // Count number of elements in Json object
        JsonArray empsArray = jsonParser.parse(myJson).getAsJsonArray();
        System.out.println("json array size: "+empsArray.size());

        // Loops through JSON object and retrieve elements asString
        for(JsonElement je : empsArray){
            JsonObject emp = je.getAsJsonObject();
            String name = emp.get("name").getAsString();
            String email = emp.get("email").getAsString();
            System.out.println("Name: "+name);
            System.out.println("Email "+email);
        }

    }
}
