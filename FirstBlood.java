public class FirstBlood {
    public static void main(String[] args) throws InterruptedException {
    new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    },"第一滴血").start();
        Thread.sleep(10000000);
    }
}