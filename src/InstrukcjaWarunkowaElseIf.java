public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        int number = -6;
        if (number == 0) {
            System.out.println("Liczba równa 0");
        } else if (number > 0){
            System.out.println("Liczba jest większa od 0");
        } else if (number < -5 ) {
            System.out.println("Liczba jest mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}