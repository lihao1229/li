package test;

public class Variable {
    private int i=1 ;
    private int j ;

    public Variable(){
    }

    public Variable(int x , int y){
        i = x;
        j = y;
    }

    public int add(int i, int j){
        return i+j;
    }

    public void setI(int i){
        this.i = i;
    }

    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }

    public static void main(String[] args){
        Variable v1 = new Variable();
        v1.setI(3);
        System.out.println(v1.getI());

        int z = v1.add(v1.getI() , v1.getJ());
        System.out.println(z);

        Variable v2 = new Variable(5, 6);
        System.out.println(v2.getI() +" "+ v2.getJ());
    }
}

