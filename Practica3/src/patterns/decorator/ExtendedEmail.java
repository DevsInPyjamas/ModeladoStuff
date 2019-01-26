package patterns.decorator;

public class ExtendedEmail implements Email {
    private Email toExtend;

    public ExtendedEmail(Email toExtend) {
        this.toExtend = toExtend;
    }

    @Override
    public String getSMPTUser() {
        return "N-User";
    }

    @Override
    public String getSMTPPassword() {
        return "N-Password";
    }

    @Override
    public void send(String to, String from, String subject, String text) {
        toExtend.send(to, from, subject, text);
    }
}
