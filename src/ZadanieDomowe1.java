import java.util.Scanner;

public class ZadanieDomowe1 {
    public static void main(String[] args) {
        System.out.println("Podaj proszę pierwszą liczbę i kliknij ENTER");
        Scanner scanner1 = new Scanner(System.in);
        float firstNumber = scanner1.nextFloat();
        System.out.println("Podaj proszę drugą liczbę i kliknij ENTER");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        float mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania Twoich liczb to: " + addition);
        System.out.println("Wynik odejmowania Twoich liczb to: " + subtraction);
        System.out.println("Wynik mnożenia Twoich liczb to: " + multiplication);
        System.out.println("Wynik dzielenia Twoich liczb to: " + division);
        System.out.println("Wynik dzielenia z resztą Twoich liczb: " + mod);


    }


}
