package com.xia.trainning.InvocationHandlerTest;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/7/16 16:47
 */
public class SayHelloImpl implements SayHello {

    public SayHelloImpl() {

    }

    public void sayHello(String name, String word) {
        System.out.println(name+",您好，"+word);

    }
}
