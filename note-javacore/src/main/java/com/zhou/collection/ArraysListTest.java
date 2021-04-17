package com.zhou.collection;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName : ArraysList
 * @Description : Arrays.asList() 的坑
 *
 * 1.基本类型不能作为 Arrays.asList方法的参数，否则会被当做一个参数。
 * 2.Arrays.asList 返回的 List 不支持增删操作。(返回的 List 并不是我们期望的 java.util.ArrayList，而是 Arrays 的内部类ArrayList)
 * 3.使用Arrays.asLis的时候，对原始数组的修改会影响到我们获得的那个List
 * 4.Object类型数组强转String数组，会发生ClassCastException。解决方案是，使用toArray()重载方法toArray(T[] a)
 * @Author : zhoul
 * @Date: 2021-04-02 11:29
 */
public class ArraysListTest {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        List list = Arrays.asList(array);
        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.toJSONString(list.get(0)));
        System.out.println(JSON.toJSONString((( int[])list.get(0))[1]));

        array[1] = 5;
        System.out.println((( int[])list.get(0))[1]);

        List<String> list2 = new ArrayList<String>(1);
        list2.add("公众号：捡田螺的小男孩");
        //类型转换异常
        System.out.println(list2.toArray(new String[list2.size()])[0]);
        String[] array21 = (String[])list2.toArray();
    }
}
