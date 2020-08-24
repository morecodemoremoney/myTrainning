package com.xia.trainning.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/24 21:01
 */

public class AnnoTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Grade grade = new Grade();
        //反射获取属性注解
       /* Field name = grade.getClass().getDeclaredField("username");
        Name annotation = name.getAnnotation(Name.class);
        grade.setUsername(annotation.value());
        System.out.println(grade.getUsername());*/
        Student annotation = grade.getClass().getAnnotation(Student.class);
        String address = annotation.address();
        int age = annotation.age();
        System.out.println(address+age);
    }
}
