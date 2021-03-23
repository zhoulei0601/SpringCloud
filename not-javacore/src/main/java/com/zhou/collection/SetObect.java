package com.zhou.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

/**
 * @ClassName : SetObect
 * @Description : equals及hashcode
 * @Author : zhoul
 * @Date: 2021-03-23 14:54
 */
public class SetObect {

    /***
    * ①是基于HashMap实现的，默认构造函数是构建一个初始容量为16，负载因子为0.75 的HashMap。
     * 封装了一个 HashMap 对象来存储所有的集合元素，所有放入 HashSet 中的集合元素实际上由 HashMap 的 key 来保存，
     * 而 HashMap 的 value 则存储了一个 PRESENT，它是一个静态的 Object 对象。
     * ②当我们试图把某个类的对象当成 HashMap的 key，或试图将这个类的对象放入 HashSet 中保存时，
     * 重写该类的equals(Object obj)方法和 hashCode() 方法很重要，而且这两个方法的返回值必须保持一致：
     * 当该类的两个的 hashCode() 返回值相同时，它们通过 equals() 方法比较也应该返回 true。通常来说，
     * 所有参与计算 hashCode() 返回值的关键属性，都应该用于作为 equals() 比较的标准。
     * ③HashSet的其他操作都是基于HashMap的
     *
    */
    public static void main(String[] args) {
        Student stu1 = new Student("张三",19, Arrays.asList(new String[]{"1","2"}));
        Student stu2 = new Student("张三",19,Arrays.asList(new String[]{"1","2"}));
        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(null);
        System.out.println(set.size());
    }
}


@Data
@AllArgsConstructor
class Student{
    private String name;
    private Integer age;
    private List<String> course;


    @Override
    public int hashCode() {
        return Objects.hash(name, age, course);
    }
}