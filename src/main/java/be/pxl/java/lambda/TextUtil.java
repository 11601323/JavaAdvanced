package be.pxl.java.lambda;

public class TextUtil {
    public static String quote(String s){
        return String.format("<<%s>>",s);
    }
    public static String reverse (String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
