import java.util.Scanner;

public class AgeCheckerZad2 {
    public static void main(String[] args) {
        System.out.println("Podaj swój wiek i kliknij ENTER");
        Scanner ageChecker = new Scanner(System.in);
        int age = ageChecker.nextInt();
        if (age <18 ){
            System.out.println("Niestety nie możesz kupić alkoholu, poproś dorosłą osobę o kupienie xD");
        } else if (age >=18) {
            System.out.println("Dziękujemy za zakupy mały kurwiu");
        }

    }


}
