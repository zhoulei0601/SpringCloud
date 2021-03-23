package com.zhou.string;

/**
 * @ClassName : StringTest
 * @Description : String 类测试
 * @Author : zhoul
 * @Date: 2021-03-23 15:41
 */
public class StringTest {
    public static void main(String[] args) {

        /**
        * 通常想String s1 = "abc"; 这样申明的字符串对象，其值就是存储在常量池中
         * 当我们创建引用String s2 = "abc" 的时候，Java底层会优先在常量池中查找是否存在"abc"，如果存在则让s2指向这个值，不会重新创建
        */
        String str1 = "zhang";
        String str2 = "zhang";
        String str3 = new String("zhang");
        String str4 = new String("zhang");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
    }
}
