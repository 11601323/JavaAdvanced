package be.pxl.java.lambda;

@FunctionalInterface
public interface WordFilter {
    public boolean isValid(String s);

}
