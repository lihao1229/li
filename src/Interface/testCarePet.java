package Interface;

public class testCarePet {
    public static void main(String[] arsg) {
        CarePet p1 = new Worker();
        p1.feed();
        p1.play();
        System.out.println("——————————————————————");

        CarePet p2 = new Farmer();
        p2.play();
        p2.feed();
        System.out.println("——————————————————————");

        CarePet p3 = new Leader();
        p3.feed();
        p3.play();
    }
}
