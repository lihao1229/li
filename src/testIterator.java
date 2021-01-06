import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testIterator {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");
        lst.add("ddd");

        Iterator<String> iterator = lst.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
