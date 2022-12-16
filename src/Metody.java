public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i =0; i<100 ; i++ ) {
            result = result + i;
            System.out.println("i:" + i + "result:"+result);
        }
        System.out.println("Wynik to: " + result);

    }

    // int result = 0  warunki wstępne
    // w pętli zawsze for(int i = 0
    //(iteracja -> zaczynam od wartości 0), 1 < 100 (iteracja do 99), i++ (zwiększam o 1)
    // w pętli wynik zwiększamy o 1


    //public - identyfikator dostępu
    // String - zwracany typ danych (int, String, Student, etc)
    // Gdy wybierzemy student, informujemy, że nasza metoda będzie zwracała obiekt klasy student
    // void - metoda nie będzie zwracała żadnej wartości
    // nazwa metody powinna kojarzyć się z zawartością

    public int policzWyniks() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
            System.out.println("i:" + i + "result:" + result);
        }
        System.out.println("Wynik to: " + result);
        return result;

    }

    public void policzWynikElastyczna(int number) {
        System.out.println("Number:" + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
            System.out.println("i:" + i + "result:" + result);
        }
        System.out.println("Wynik to: " + result);

        //aby metoda była bardziej elastyczna, można zakres dla iteracji z pętli zastąpić zmienną "number"
        //należy ją dodać do nawiasu w public void

    }

//    public void add(int FirstNumber, int SecondNumber) {
//        System.out.println(FirstNumber+SecondNumber);
//    }

    public int add (int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber);
        if(FirstNumber==0)
        return 0;
        else return FirstNumber;



    }
    }
