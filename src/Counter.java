public class Counter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<11;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
