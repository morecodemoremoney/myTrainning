package com.xia.trainning.custException;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/25 14:30
 */
public class ExceTest {

    public static void main(String[] args)  {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
