import java.util.Scanner;

public class CustomScanner {
/*    public static void main(String[] args) {
        System.out.println("Podaj proszę imię i kliknij ENTER");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");*/

    public static void main(String[] args) {
        System.out.println("Podaj proszę pierwszą liczbę");

        Scanner scanner = new Scanner(System.in);
        /*String liczba = scanner.nextLine();
        System.out.println("Liczba " + liczba + " jest poprawna!");*/
        int firstNumber = scanner.nextInt();
        int result = firstNumber*firstNumber;
        System.out.println("Kwadrat tej liczby to " + result);






    }



}
