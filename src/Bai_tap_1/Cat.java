package Bai_tap_1;

public class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("Mèo Ăn");
    }

    @Override
    public void makeSound() {
        System.out.println("Mèo Kêu");
    }

    public  void run(){
        System.out.println("Mèo Tom and Jerry");
    }
}
