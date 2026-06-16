import java.util.ArrayList;

public class Day10 {
    static void main(){
       ArrayList<String>list = new ArrayList();
       list.add("Dheshnaa");
        list.add("Lasika");
        list.add("Sajitha");
        list.add("Rithika");
        list.add("Ram");
for (String a:list){
    System.out.println(a);
}
list.remove("Ram");
System.out.println();
        for(String a: list) {
            System.out.println(a);
        }
    }
}

