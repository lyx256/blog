package com.blog.blogoss.annotation;


import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface UserLoginToken {
    boolean required()default true;
}
