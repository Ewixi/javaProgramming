public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student polak = new Student();
        polak.imie = "Jacek";
        polak.nazwisko = "Grucha";
        polak.nick = "Grucha";
        polak.email = "jacek.grucha@wp.pl";
        String uczelniapolaka = polak.nazwaUczelni;
        System.out.println("Uczelnia polaka to: "+ uczelniapolaka);
        Student.infoUczelnia();  // wywołanie metody statycznej klasy Student, nazwa metody: infoUczelnia

        /*polak.przedstawSie();
        polak.zalogujSie();
        polak.podajEmail();
        polak.podajNrIndeksu();*/

        Student rusek = new Student();
        rusek.imie = "Rusek";
        rusek.nazwisko = "Lisek";
        rusek.nick = "Lisek";
        rusek.email = "lisek.rusek@wp.pl";

       /* rusek.przedstawSie();
        rusek.zalogujSie();
        rusek.podajEmail();
        rusek.podajNrIndeksu();*/

        Student kusek = new Student();
        kusek.imie = "Kusek";
        kusek.nazwisko = "Kisek";
        kusek.nick = "Kaisek";
        kusek.email = "kusek.kisek@wp.pl";

        /*kusek.przedstawSie();
        kusek.zalogujSie();
        kusek.podajEmail();
        kusek.podajNrIndeksu();*/

        Student[] students = new Student[]{polak , rusek, kusek};
        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].podajEmail();

        }
    }
}
