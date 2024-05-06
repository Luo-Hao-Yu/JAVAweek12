public class mainMessage {
    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessagePrinter("Hello"));
        Thread worldThread = new Thread(new MessagePrinter("World"));
        helloThread.start();
        worldThread.start();
    }
}
