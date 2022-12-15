// umożliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
float thirdNumber = 4F;

       int addition = firstNumber + secondNumber; // 10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; //0.66
        int mod = secondNumber%firstNumber; // 2

    /*    System.out.println("Wynik dodawania" + " : " + addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);*/

        firstNumber+=secondNumber;  // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber); // 10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odjęciu: " + firstNumber); // 4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); // 24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); // 4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber); // 6



    }


}
