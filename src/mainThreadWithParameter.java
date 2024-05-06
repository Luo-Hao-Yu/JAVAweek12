public class mainThreadWithParameter {
    public static void main(String[] args) {
//        MyFirstThreadWithParameter mftp1 = new MyFirstThreadWithParameter("hello");
//        MyFirstThreadWithParameter mftp2 = new MyFirstThreadWithParameter("World");
//        mftp1.start();
//        mftp2.start();
        MyFirstThreadWithParameter mftp1 = new MyFirstThreadWithParameter();
        MyFirstThreadWithParameter mftp2 = new MyFirstThreadWithParameter();
        mftp1.get("HHHello");
        mftp2.get("world");
        mftp1.start();
        mftp2.start();

    }
}
