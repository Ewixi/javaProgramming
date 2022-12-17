package Dziedziczenie;

public class Test {
    public static void main(String[] args) {
        Person test = new Person("Julia", 35);

        test.name = "Kasia";
        test.age = 20;
        test.walk();
        test.eat();

        Footballer footballer = new Footballer("Jasio", 30, "Amarantas");
//        footballer.name = "Jacob";
//        footballer.age = 33;
        footballer.walk();
        footballer.eat();
//        footballer.playFootball();
    }
}
