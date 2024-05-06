import java.lang.reflect.Parameter;

public class MyFirstThreadWithParameter extends Thread{
    private String message;
//    public MyFirstThreadWithParameter(String message){
//        this.message= message;
//    }
    public void get(String message){
        this.message= message;
    }
    public void run(){
        System.out.println(message);
    }
}
