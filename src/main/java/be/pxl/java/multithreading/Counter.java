package be.pxl.java.multithreading;

public class Counter {
    private int count = 0;
    private  Object monitor = new Object(); //moet niet persee een apart object zijn gekunt ook waar monitor staat (this) zetten of in public syncronized void doen

    public int getCount() {
        return count;
    }

    public void increment(){
        synchronized (monitor) {
            count++;
        }
    }

    public void decrement(){
        synchronized (monitor){
        count--;
        }
    }


}
