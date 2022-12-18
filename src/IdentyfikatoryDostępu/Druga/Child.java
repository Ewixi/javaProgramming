package IdentyfikatoryDostępu.Druga;

import IdentyfikatoryDostępu.Pierwsza.Parent;

public class Child extends Parent {    //alt + enter - zaimportowanie, jeśli nie działa automatycznie

    // klasa potomna w innej paczce niż rodzic, nie ma dostępu do pól private oraz default (tak znany identyfikator "package")

    public void testIdentifier() {
        System.out.println(first);
//        System.out.println(second); // nie mam dostępu do default
        System.out.println(third);
//        System.out.println(fourth);  // nie mam dostępu do private

        firstMethod();
//        secondMethod();
        thirdMethod();
//        fourthMethod();

    }
}