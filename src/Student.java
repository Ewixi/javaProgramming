public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca " + nick);

    }
    public void podajNrIndeksu() {
        System.out.println("Moj numer indeksu to: " + numerIndeksu );

    }
    public void podajEmail() {
        System.out.println("Moj adres email to: " + email);
    }
}
