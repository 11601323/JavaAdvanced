package be.pxl.java.multithreading.concurency;

import java.util.List;
import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Long> {
    private int max;

    public FactorialCalculator(int max) throws Exception {
        if(max < 0){
            throw new Exception();
        }
        this.max = max;
    }


    @Override
    public Long call() throws Exception {
        long fac = 1;
        for(int i = 1; i < max + 1 ; i++){
            fac = i * fac;
        }
        return fac;
    }
}
