package Bai_tap_1;

//khởi tạo lớp trừu tượng animals
public abstract class Animals {

    //khởi tạo phương thức
    public abstract void eat();

    public abstract void makeSound();

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.run();

        bird bird = new bird();
        bird.eat();
        bird.fly();
        bird.makeSound();
    }
}
