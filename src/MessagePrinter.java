public class MessagePrinter implements Runnable{
    String message;
    public MessagePrinter(String message){
        this.message=message;
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(message);
        }
    }
}
