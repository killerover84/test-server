package com.tang.test.use;

import com.tang.test.annotation.MyTestAnnotation;

public class UseMyTestAnnotation {
    @MyTestAnnotation(name = "sangxiao")
    public String namePlus(String firstName){
        return firstName;
    }
}
