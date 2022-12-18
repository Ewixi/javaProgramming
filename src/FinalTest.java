import Dziedziczenie.Person;

public class FinalTest {
    public static void main(String[] args) {
        final int x=2;   //przypisanie wartości końcowej do pola/obiektu/metody, bez moźliwości zmiany

        final Person person = new Person("Tim", 26);
        person.age = 25;

//        person = new Person("Tom", 22); - nie można do tego obiektu przypisać innej wartości


    }


}
