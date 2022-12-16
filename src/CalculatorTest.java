import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Podaj proszę pierwszą liczbę i kliknij ENTER");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        System.out.println("Podaj proszę drugą liczbę i kliknij ENTER");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania Twoich liczb to: " + addition);
        System.out.println("Wynik odejmowania Twoich liczb to: " + subtraction);
        System.out.println("Wynik mnożenia Twoich liczb to: " + multiplication);
        System.out.println("Wynik dzielenia Twoich liczb to: " + division);
        System.out.println("Wynik dzielenia z resztą Twoich liczb: " + mod);


    }


}
