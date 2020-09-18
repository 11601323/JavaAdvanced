import be.pxl.java.JUnit.Temperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperaturTest {
    private Temperature t;

    @Test
     @DisplayName("Test die de constructor test")
    public void testConstructor(){
        Temperature temp = new Temperature(40);
        Assertions.assertEquals(40, temp.getValue());
    }

    @Test
    @DisplayName("Test die de de set en get test")
    public void testValue(){
        Temperature temp = new Temperature(50);
        temp.setValue(30);
        Assertions.assertEquals(30,temp.getValue());
    }

    @Test
    public void testEquals(){
        Temperature temp1 = new Temperature(50);
        Temperature temp2 = new Temperature(50);
        Assertions.assertEquals(false, temp1.equals(temp2));
    }

    @BeforeEach
    public void init(){
        Temperature temp = new Temperature(0);
        this.t = temp;
    }

    @Test
    public void testBoiling(){
        float f2 = 51;
        t.setValue(f2);
        Assertions.assertTrue(t.isBoiling());
    }

    @Test
    public void testException(){

    }
}
