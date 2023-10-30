import java.util.ArrayList;
import java.util.List;

public class hello {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
    }
}
