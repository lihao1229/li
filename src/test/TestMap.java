package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String , Integer> m1 = new HashMap<String , Integer>();
        Map m2 = new TreeMap();

        m1.put("one" , 1);
        m1.put("two" , 2);
        m1.put("three" , 3);

        m2.put("A" , 1);
        m2.put("B" , 2);

        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(2));

        if(m1.containsKey("two")) {
            int i = m1.get("two");
            System.out.println(i);
        }

        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);
    }
}
