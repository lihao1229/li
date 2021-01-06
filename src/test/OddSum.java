package test;

public class OddSum {
    public static void main(String[] args) {
        // 求101 到200 之间的质数
        for(int i = 101 ; i<200 ; i += 2) {
            boolean f = true;
            for(int j = 2 ; j<i ; j++) {
                if(i % j == 0)
                    f = false;
                break;
            }
            if(!f){continue;}
            System.out.println(" "+i);
        }
    }
}
