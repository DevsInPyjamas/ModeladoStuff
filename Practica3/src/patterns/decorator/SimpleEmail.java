package patterns.decorator;

public class SimpleEmail implements Email {
    @Override
    public String getSMPTUser() {
        return "User";
    }

    @Override
    public String getSMTPPassword() {
        return "Password";
    }

    @Override
    public void send(String to, String from, String subject, String text) {
        System.out.println("Sended the email from " + from + " to " + to + " with the subject " + subject + " and" +
                " the following content: " + text);
    }
}
