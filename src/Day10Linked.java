import  java.util.LinkedList;
import java.util.Queue;

    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Ashmitha");
        queue.add("Dheshnaa");
        queue.add("Lasika");
        queue.add("Rithika");
        queue.add("Sajitha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }