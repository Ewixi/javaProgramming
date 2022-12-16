package Konstruktory;

public class UserTest {
    public static void main(String[] args) {
        User userTest = new User();
        userTest.username = "Ewixi";
        userTest.password = "Qwerty";
        userTest.sayHello();
    }
}
// Konstruktor - specjalna metoda która jest wywoływana w linijce:
//       User userTest = new User();