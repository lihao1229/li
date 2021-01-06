package code;

public class SimpleTest {
    public int add(int x, int y) {
        return x + y;
    }


    public int divide(int x, int y){
        return x/y;
    }

    public int[] num(int x ,int y){
        System.out.println("你好");
        int[] z = new int[2];
        z[0] = x;
        z[1] = y;
        return z;
    }


}
