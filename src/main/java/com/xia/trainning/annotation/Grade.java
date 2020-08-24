package com.xia.trainning.annotation;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/8/24 21:12
 */
@Student(age = 12,address = "湖北")
public class Grade {

    @Name("ddsdas")
    public String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
