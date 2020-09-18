package be.pxl.java.multithreading.concurency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteAppPrimes {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        PrimeCalculator pc = new PrimeCalculator(100);
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<List<Long>> future = es.submit(pc);

        while(!future.isDone()){
            System.out.println("Waiting");
        }
        List<Long> primes = future.get();

        for(long p : primes){
            System.out.println(p);
        }
        es.shutdown();
    }
}
