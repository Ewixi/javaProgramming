public class MetodyTest {
    public static void main(String[] args) {

        Metody metody = new Metody();
     // metody.policzWynik();

    //    składnia jest następująca:
    // NazwaKlasy NazwaZmiennej = new NazwaKlasy();
        // (NazwaKlasy utorzona przeze mnie w innej karcie)
        // NazwaZmiennej - dowolna nazwa nadane przeze mnie
        // new jako słowo kluczowe do stworzenia Obiektu typu mojej klasy

        //Metody metody1 = new Metody();
        //metody.policzWyniks();

        // zastosowanie public int zamiast public voic powoduje możliwość zwrócenia danej bez konieczności przechodzenia
        // ponownie przez pętle
        //np. potrzebuje wynik 4950, więc mogę go w przyszłości pobrać za pomocą składni:
        // int NazwaNowejZmiennej = metody.policzWyniks();

           // int WywołujeSobieZmienną =  metody.policzWyniks() + 151900;
     //   System.out.println(WywołujeSobieZmienną);

        int number = 5;
        metody.policzWynikElastyczna(number);

        //dodawanie zmiennych za pomocą metody   public void add(int nazwaZmiennej, int nazwaZmiennej) {
        metody.add(0,3);

    }

}
