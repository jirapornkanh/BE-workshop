import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayhi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayhi_should_return_Hello_Palm(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("palm");
        assertEquals("Hello Palm", result);
    }

    @Test
    public void sayhi_should_return_Hello_Jiraporn(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("jiraporn");
        assertEquals("Hello Jiraporn", result);
    }

}