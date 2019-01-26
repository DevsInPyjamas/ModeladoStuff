package patterns.decorator;

public class AttachedForgotten extends ExtendedEmail {
    public AttachedForgotten(Email toExtend) {
        super(toExtend);
    }

    private void additionalBehaviour(){
        System.out.print("HEY! You forgot to attach some files to the email! Want to proceed? ");
    }

    @Override
    public void send(String to, String from, String subject, String text) {
        this.additionalBehaviour();
        super.send(to, from, subject, text);
    }
}
