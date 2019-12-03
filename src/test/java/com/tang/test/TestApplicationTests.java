package com.tang.test;

import com.tang.test.annotation.MyTestAnnotation;
import com.tang.test.use.UseMyTestAnnotation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testAnnotation() throws Exception{
        Method[] methods = UseMyTestAnnotation.class.getClassLoader()
                .loadClass("com.tang.test.use.UseMyTestAnnotation").getMethods();
        UseMyTestAnnotation useMyTest = new UseMyTestAnnotation();
        for(Method fun : methods){
            if(fun.isAnnotationPresent(MyTestAnnotation.class)){
                MyTestAnnotation myTest = fun.getAnnotation(MyTestAnnotation.class);
                System.out.println(fun.invoke(useMyTest,"tang") + myTest.name());
            }
        }
    }
}
