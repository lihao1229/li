package test;

import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
    private static final int ONE = 1;
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        for(int i =0; i<args.length; i++) {
             args[i] = in.next();
        }*/
        Map<String , Integer> m = new HashMap<String, Integer>();
        for(int i = 0; i<args.length; i++) {
            int freq =  m.get(args[i]);
            m.put(args[i] , freq == 0 ? ONE : freq + 1);
        }
        System.out.println(m.size() + " distinct words detected:");
        System.out.println(m);
    }
}
