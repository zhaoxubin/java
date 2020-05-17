public class InterruptThread {
    //在第一段代码，在
//    public static void main(String[] args) throws InterruptedException {
//      Thread t =  new Thread(()->{
//            try {
//                while(!Thread.interrupted()){//判断当前线程是否被中断--》判断中断的标志位
//                    System.out.println(Thread.currentThread().getName());
//                    //sleep线程阻塞时，也可以中断，但是是以抛出InterruptedException异常来中断的
//                    Thread.sleep(1000000000);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//         t.start();
//        Thread.sleep(2000);
//        //特殊情况出现，要中断子线程
//        t.interrupt();
//    }
    //第二段代码：线程初始时中断标志位为false
    //调用线程interrput方法，中断标志位为true
    //线程处于阻塞态，中断抛出异常，会重置标志位
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(()->{ //标志位isInterrupted = false
//            while(!Thread.interrupted()) {
//                try {
//                    //判断当前线程是否被中断--》判断中断的标志位
//                    System.out.println(Thread.currentThread().getName());
//                    //sleep线程阻塞时，也可以中断，但是是以抛出InterruptedException异常来中断的
//                   //会重置isInterrupted = false
//                    Thread.sleep(1000000000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t.start();
//        Thread.sleep(2000);
//        //特殊情况出现，要中断子线程
//        t.interrupt();
//    }
    //第三段：
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{ //标志位isInterrupted = true
            for (int i = 0; i < 10 ; i++) {
                //Thread.interrupted():  //返回当前中断标志，并重置标志位
                // (1)boolean tmp = isInterrputed
                //(2)isInterrputed = false
                //(3)return tmp
                System.out.println( Thread.interrupted());
            }
        });
        t.start(); //t.isInterrupted = false

        //特殊情况出现，要中断子线程
        t.interrupt();//t.isInterrupted = true
    }
    //四
    //线程对象isInterrupted()只返回中断标志位，不会做任何修改
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(()->{ //标志位isInterrupted = true
//            for (int i = 0; i < 10 ; i++) {
//
//                System.out.println( Thread.currentThread().isInterrupted());
//            }
//        });
//        t.start();
//
//        //特殊情况出现，要中断子线程
//        t.interrupt();//t.isInterrupted = true
//    }
}