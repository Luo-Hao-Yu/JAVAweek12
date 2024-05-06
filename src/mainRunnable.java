public class mainRunnable {
    public static void main(String[] args) {
        Thread T1 = new Thread(new Counter(),"counter1");
        Thread T2 = new Thread(new Counter(),"counter2");
        T1.start();
        T2.start();
    }
}
