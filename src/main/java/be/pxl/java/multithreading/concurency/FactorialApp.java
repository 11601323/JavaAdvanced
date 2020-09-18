package be.pxl.java.multithreading.concurency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialApp {
    public static void main(String[] args) throws Exception {
        FactorialCalculator factorialCalculator = new FactorialCalculator(8);
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<Long> future = es.submit(factorialCalculator);

        while(!future.isDone()){
            System.out.println("Waiting");
        }

        Long fac = future.get();
        System.out.println(fac);
        es.shutdown();
    }
}
