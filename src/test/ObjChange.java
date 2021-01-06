package test;//对象转型

class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public String eyecolor;

    Cat(String n , String c) {
        super(n);
        eyecolor = c;
    }
}

class Dog extends Animal {
    public String furcolor;

    Dog(String n , String c) {
        super(n);
        furcolor = c;
    }
}


public class ObjChange {
    public static void main(String[] args) {
        Animal a = new Animal("name");
        Cat c = new Cat("catname" , "blue");
        Dog d =new Dog("dogname" , "black");

        System.out.println(a instanceof Animal);
        System.out.println(c instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Cat);

        a = new Dog("bigyello" , "yellow");
        System.out.println(a.name);
        //System.out.println(a.furcolor); //父类不能访问子类 新增加的成员
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        Dog d1 = (Dog)a ;
        System.out.println(d1.furcolor); //加了强制转换符，就可以访问子类的成员了

    }
}
