import be.pxl.java.JUnit.HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    public void testSayHello(){
        HelloWorld hello = new HelloWorld();
        String awnser = hello.sayHello();
        Assertions.assertEquals("Hello World", awnser);
    }
}
