package mylist;
import java.util.Calendar;
import java.util.Date;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String [] agrs){
        List<Integer> dll = new DoublyLinkedList<>();
        List<Integer> ll = new ListImplLinkedBased<>();
        for (int i = 0; i < 10000; i++) {
            dll.append(i);
            ll.append(i);
        }

        long startTime = System.nanoTime();
        dll.set(49000, 9000);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total time doubly linked list: " + totalTime);

        startTime = System.nanoTime();
        ll.set(49000, 9000);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Total time linked list: " + totalTime);
    }
}
