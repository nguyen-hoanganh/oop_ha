package Bai_tap_1;

public class bird extends Animals{
    @Override
    public void eat() {
        System.out.println("Bird Ăn");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird hót");
    }

    public  void  fly(){
        System.out.println("Bird bay");
    }
}
