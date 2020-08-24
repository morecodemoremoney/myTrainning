package com.xia.trainning.InvocationHandlerTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * Description: 反向代理学习
 * </p>
 *
 * @author bh.xia
 * @date 2020/7/16 16:44
 */
public class SayHelloProxy implements InvocationHandler {
    public SayHello sayHello;

    public Object bind(SayHello sayHello) {
        this.sayHello = sayHello;
        return Proxy.newProxyInstance(this.sayHello.getClass().getClassLoader(), this.sayHello.getClass().getInterfaces(), this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("准备问候...");
        result = method.invoke(this.sayHello, args);
        return result;
    }

    public static void main(String[] args) {
        SayHelloProxy proxy = new SayHelloProxy();
        SayHello sayHello1 = new SayHelloImpl();
        SayHello impl= (SayHello) proxy.bind(sayHello1);
        impl.sayHello("xia","快看比赛吧");

    }
}
