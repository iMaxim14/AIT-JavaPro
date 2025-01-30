package homeworks.homework01;

public class MyThread extends Thread{
    private final Array array;
    private int result;

    public MyThread(Array array) {
        this.array = array;
    }

    @Override
    public void run(){
        System.out.println(array.quantityResult());
    }
}
