package package1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class HelloWorldTest {


    @Test
    void test() {
    assertEquals("test123",HelloWorld.print("test123"));
    }

}
