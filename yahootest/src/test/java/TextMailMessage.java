public class TextMailMessage {

    private WriteMessage writeMessage;

    public boolean atPage() {
        writeMessage.enterUserMail();
        writeMessage.enterTopic();
        writeMessage.enterTextMessage();
        return true;

    }
}
