package com.xia.trainning.annotation;


import java.lang.annotation.*;

/**
 * @author hua
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Name {
    String value();
}
