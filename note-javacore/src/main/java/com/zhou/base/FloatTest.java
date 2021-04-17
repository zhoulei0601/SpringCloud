package com.zhou.base;

/**
 * @ClassName : FloatTest
 * @Description : 浮点类型不精准运算
 * @Author : zhoul
 * @Date: 2021-04-02 11:17
 */
public class FloatTest {
    public static void main(String[] args) {
        System.out.println(0.1+0.2);
        System.out.println(1.0-0.8);
        System.out.println(4.015*100);
        System.out.println(123.3/100);

        double amount1 = 3.15;
        double amount2 = 2.10;
        if (amount1 - amount2 == 1.05){
            System.out.println("OK");
        }
    }
}
