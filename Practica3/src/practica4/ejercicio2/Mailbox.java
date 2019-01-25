package practica4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    private List<Email> emails;
    private SorterStrategy sorterStrategy;

    public Mailbox(SorterStrategy sorterStrategy) {
        emails = new ArrayList<>();
        this.sorterStrategy = sorterStrategy;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }

    public void show() {
        for (Email email: emails) {
            System.out.println(email);
        }
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public SorterStrategy getSorterStrategy() {
        return sorterStrategy;
    }

    public void setSorterStrategy(SorterStrategy sorterStrategy) {
        this.sorterStrategy = sorterStrategy;
    }

    public void sort() {
        for (int i = 0; i < emails.size(); i++) {
            for (int j = 0; j < (emails.size() - i - 1); j++) {
                if (sorterStrategy.before(emails.get(j), emails.get(j - 1))) {
                    Email em = emails.get(j);
                    emails.set(j, emails.get(j - 1));
                    emails.set(j, em);
                }
            }
        }
    }
}
