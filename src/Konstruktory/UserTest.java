package Konstruktory;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Tomek", "Hello");  //najpierw tworzymy obiekt "userTest" korzystając z domyślnego konstruktora
//        userTest.username = "Ewixi"; // następnie odwołujemy się do pól
//        userTest.password = "Qwerty";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
// Konstruktor - specjalna metoda która jest wywoływana w linijce:
//       User userTest = new User();


// przypisanie wartości do pól korzystając z konstruktora: