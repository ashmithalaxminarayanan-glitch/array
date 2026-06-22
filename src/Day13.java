import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day13    {
    static void main() {
        Path path = Path.of("Files", "report.txt");
        try{
            List<String> value = Files.readAllLines(path);

            for (String v : value) {
                System.out.println(v);
            }

            List<String> m = new ArrayList<>();
            m.add("Puppy1");
            m.add("Puppy2");
            m.add("Puppy3");
            m.add("Puppy4");
            m.add("Puppy5");

            Files.write(path, m);
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
}




