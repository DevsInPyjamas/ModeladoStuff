package patterns.decorator;

public interface Email {
    String getSMPTUser();
    String getSMTPPassword();
    void send(String to, String from, String subject, String text);
}
