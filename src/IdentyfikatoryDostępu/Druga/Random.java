package IdentyfikatoryDostępu.Druga;

import IdentyfikatoryDostępu.Pierwsza.Parent;

public class Random {
    public void testIdentifier() {
        // tworząc klasę w innej paczce niż parent - bez dziedziczenia - mamy dostęp tylko do pól/metod public
        Parent parent = new Parent();
        System.out.println(parent.first);
//        System.out.println(parent.second);
//        System.out.println(parent.third);
//        System.out.println(parent.fourth);

        parent.firstMethod();
//        parent.secondMethod();
//        parent.thirdMethod();
//        parent.fourthMethod();
    }
}
