package lessons.lesson01;

public class UseRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thred1 = new Thread(new MyRunnableTask()); // new lessons.lesson01.MyThreadTask
        Thread thred2 = new Thread(new MyRunnableTask()); // new lessons.lesson01.MyThreadTask
        thred1.setName("T1");
//        thred1.setPriority(Thread.MIN_PRIORITY);
        thred2.setName("T2");
//        thred2.setPriority(Thread.MAX_PRIORITY);
        thred1.start();
        thred1.join();
        thred2.start();
        thred2.join();
        System.out.println(Thread.currentThread().getName() + ": END.");
    }
}
