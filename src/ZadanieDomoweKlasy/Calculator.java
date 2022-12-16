package ZadanieDomoweKlasy;

public class Calculator {

    public static void main(String[] args) {
        Addition1 metody = new Addition1();
        int FirstNumber = 6;
        int SecondNumber = 2;

        System.out.println("Wynik dodawania to:" + metody.Dodawanie(FirstNumber,SecondNumber));

        Subtraction1 metody1 = new Subtraction1();

        System.out.println("Wynik odejmowania to:" + metody1.Odejmowanie(FirstNumber,SecondNumber));

        Multiplication1 metody2 = new Multiplication1();

        System.out.println("Wynik mnozenia to:" + metody2.Mnozenie(FirstNumber,SecondNumber));

        Division1 metody3 = new Division1();

        System.out.println("Wynik dzielenia to:" + metody3.Dzielenie(FirstNumber,SecondNumber));



    }





}
