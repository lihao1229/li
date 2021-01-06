package test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class testIterator {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Name("f1" , "l1"));
        c.add(new Name("f2" ,"l2"));
        Iterator i = c.iterator();
        while(i.hasNext()){
            Name n = (Name) i.next();
            System.out.println(n.getFirstName());
        }
    }
}

