package Interface;

public class Test {
    public static void main(String[] args) {
        Singer s1 = new Student("jack");
        s1.sing();
        s1.sleep();

        Singer s2 = new Teacher("mike");
        s2.sleep();
        s2.sing();

        Painter p1 = (Painter) s2;
        p1.eat();
        p1.paint();
    }
}
