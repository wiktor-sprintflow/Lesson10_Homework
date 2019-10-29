package test;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.getName());
        dog1.setName("AAA");
        System.out.println(dog1.getName());

    }
}
