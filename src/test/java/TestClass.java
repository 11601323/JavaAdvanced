import org.junit.jupiter.api.*;

public class TestClass {

    public TestClass(){
        System.out.println("constructor");
    }

    @BeforeAll //Gaat voor alle methodes
    public static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @BeforeEach //Gaat voor elke test
    public void beforeEach(){
        System.out.println("BeforeEach");
    }

    @Test
    @DisplayName("-----Test1-----")
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    @Disabled("Disabled because implemntation not finished yet.")
    public void test2(){
        System.out.println("Test2");
    }

    @AfterEach //Gaat na elke test
    public void afterEach(){
        System.out.println("afterEach");

    }

    @AfterAll //gaat na elke methode
    public static void afterAll (){
        System.out.println("AfterAll");
    }
}
