public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;

    public static String nazwaUczelni = "AGH";   //nazwaUczelni w tym przypadku jest polem statycznym

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);

    }
//    public void podajNrIndeksu() {
//        System.out.println("Moj numer indeksu to: " + numerIndeksu );


    public void podajEmail() {
        System.out.println("Moj adres email to: " + email);
    }

    public static void infoUczelnia(){   //utworzenie metody statycznej
        System.out.println("Moja uczelnia to AGH "+ nazwaUczelni);

    }
}
