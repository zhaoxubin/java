public class StopThreadTest {
    private volatile static  boolean Is_Stop;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            try {
                while(!Is_Stop){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(3000);
        //特殊情况出现，要中断子线程
        Is_Stop = true;
    }
}