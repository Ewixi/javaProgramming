package ZadanieDomoweKlasy;

public class Calculator {

    public static void main(String[] args) {
        Addition1 metody = new Addition1();
        int FirstNumber = 6;
        int SecondNumber = 1050323;

        System.out.println("Wynik dodawania to:" + metody.Dodawanie(FirstNumber,SecondNumber));

        Subtraction1 metody1 = new Subtraction1();

        System.out.println("Wynik odejmowania to:" + metody1.Odejmowanie(FirstNumber,SecondNumber));


    }





}
