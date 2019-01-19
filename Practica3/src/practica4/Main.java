package practica4;


import practica4.ejercicio2.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Email e1 = new Email("J", "C", new Date(), new Priority(200), "AAAAAAAAAAAA");
        Email e2 = new Email("L", "A", new Date(), new Priority(2), "BBBBBBBBBBBB");
        Email e3 = new Email("A", "Z", new Date(), new Priority(100), "CCCCCCCCCCCC");
        Mailbox mailbox = new Mailbox(new FromSorter());
        List<Email> eMAIL = new ArrayList<>();
        eMAIL.add(e1);
        eMAIL.add(e2);
        eMAIL.add(e3);
        mailbox.setEmails(eMAIL);
        mailbox.show();
        mailbox.sort();
        mailbox.show();
    }
}
