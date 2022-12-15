public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i =0; i<100 ; i++ ) {
        result = result + i;
        }
        System.out.println("Wynik to: " + result);

    }

    // int result = 0  warunki wstępne
    // w pętli zawsze for(int i = 0
    //(zaczynam od wartości 0), 1 < 100 (iteracja do 99), i++ (zwiększam o 1)
    // w pętli wynik zwiększamy o 1


    //public - identyfikator dostęu
    // String - zwracany typ danych (int, String, Student, etc)
    // Gdy wybierzemy student, informujemy, że nasza metoda będzie zwracała obiekt klasy student
    // void - metoda nie będzie zwracała żadnej wartości
    // nazwa metody powinna kojarzyć się z zawartością
}
