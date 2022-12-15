public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;


        // && operator "and"

        System.out.println(firstValue && secondValue); // potrzeba aby wszystkie warunki byly prawdziwe

        // || operator "or"

        System.out.println(firstValue || secondValue); // wystarczy jeden true, żeby zwróciło true
        System.out.println(secondValue || thirdValue);

// ! negacja zwraca przeciwną wartość do wyrażenia

        System.out.println(! firstValue);
        System.out.println(!(firstValue&&secondValue));
    }


}
