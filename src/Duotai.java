//多态的应用

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public void enjoy() {
        System.out.println("叫声～～");
    }
}

class Cat extends Animal {
    public String eyecolor;

    Cat(String n , String c) {
        super(n);
        eyecolor = c;
    }

    public void enjoy() {
        System.out.println("猫叫声");
    }
}

class Dog extends Animal {
    public String furcolor;

    Dog(String n , String c) {
        super(n);
        furcolor = c;
    }

    public void enjoy() {
        System.out.println("狗叫声");
    }
}

class Bird extends Animal {
    Bird() {
        super("bird");
    }

    public void enjoy() {
        System.out.println("鸟叫声");
    }
}

class Lady {
    private String name;
    private Animal pet;
    Lady(String name , Animal pet) {
        this.name = name;
        this.pet = pet;
    }
    public void myPetEnjoy() {
        pet.enjoy();
    }
}

public class Duotai {
    public static void main(String[] args) {
        Cat c = new Cat("catname" , "blue");
        Dog g = new Dog("dogname" , "black");
        Bird b = new Bird();

        Lady l1 = new Lady("l1" , c);
        Lady l2 = new Lady("l2", g);
        Lady l3 = new Lady("l3",b);

        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}