package patterns;

import patterns.decorator.AttachedForgotten;
import patterns.decorator.Email;
import patterns.decorator.ExtendedEmail;
import patterns.decorator.SimpleEmail;

public class Main {
    public static void main(String[] args) {
        Email e = new AttachedForgotten(new SimpleEmail());
        e.send("KS", "AV", "APROBADO", "HAS APROBADO MODELADO");
    }
}
