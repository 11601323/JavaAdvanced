package be.pxl.java.multithreading.Parallellisme;

import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class ParallelApp {
    public static void main(String[] args) {

        OptionalDouble sum = LongStream.rangeClosed(1, 1_000_000_000L)
                .parallel()
                .mapToDouble(Math::sqrt)
                .map(Math::log)
                .average();

        System.out.println(sum);
    }
}
