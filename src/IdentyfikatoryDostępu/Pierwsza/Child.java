package IdentyfikatoryDostępu.Pierwsza;

public class Child extends Parent{
    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
//        System.out.println(fourth);

        firstMethod();
        secondMethod();
        thirdMethod();
//        fourthMethod();

        // klasa potomna w tej samej paczce co rodzic nie ma jedynie dostępu do modyfikatora dostępu "private"
    }



}
