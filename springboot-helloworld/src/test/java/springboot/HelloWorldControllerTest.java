package springboot;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.helloworld.controller.HelloWorldController;

/**
* Spring Boot HelloWorldController 测试 - {@link HelloWorldControllerTest}
*
* Created by bysocket on 16/4/26.
*/
public class HelloWorldControllerTest {
   @Test
   public void testSayHello() {
       assertEquals("Hello,World!",new HelloWorldController().sayHello());
   }
}