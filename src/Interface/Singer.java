package Interface;

public interface Singer {
    public void sing();
    public void sleep();
}
interface Painter {
    public void paint();
    public void eat();
}

class Student implements Singer {
    private String name;
    Student(String name) {
        this.name = name;
    }
    public void sing() {
        System.out.println("Student is singing");
    }
    public void sleep() {
        System.out.println("Student is sleeping");
    }
}

class Teacher implements Singer , Painter {
    private String name;
    Teacher(String name) {
        this.name =  name;
        System.out.println(name);
    }
    public void sing(){
        System.out.println("teacher is sing");
    }
    public void sleep() {
        System.out.println("teacher is sleeping");
    }
    public void paint() {
        System.out.println("teacher is painting");
    }
    public void eat() {
        System.out.println("teacher is eating");
    }
}
