package practica4.ejercicio2;

import java.util.Date;

public class Email {
    private String from;
    private String subject;
    private Date date;
    private Priority priority;
    private String text;

    public Email(String from, String subject, Date date, Priority priority, String text) {
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.priority = priority;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
