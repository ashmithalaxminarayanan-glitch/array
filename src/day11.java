import java.util.HashMap;
import java.util.Map;


public class day11 {
    static void main(String[] args){
        Map<String, Integer> person = new HashMap<>();
        person.put("Ram",89);
        person.put("John",78);
        person.put("Aravindh",67);
        person.put("Ramesh",90);

        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}

