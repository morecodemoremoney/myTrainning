package com.xia.trainning.custException;

/**
 * <p>
 * Description: 自定义异常
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/25 14:28
 */
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
