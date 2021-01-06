package Interface;

public interface CarePet {
    public void feed();
    public void play();
}

class Worker implements CarePet {
    public void feed() {
        System.out.println("喂馒头");
    }
    public void play() {
        System.out.println("工人play");
    }
}

class Farmer implements CarePet {
    public void feed() {
        System.out.println("喂粮食");
    }
    public void play() {
        System.out.println("农民play");
    }
}

class Leader implements CarePet {
    public void feed() {
        System.out.println("喂海参");
    }
    public void play() {
        System.out.println("干部play");
    }
}