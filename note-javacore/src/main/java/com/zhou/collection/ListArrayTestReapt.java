package com.zhou.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName : ListArrayTestReapt
 * @Description : 集合元素去重
 * @Author : zhoul
 * @Date: 2021-03-23 16:12
 */
public class ListArrayTestReapt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ce");
        list.add("ce");
        list.add("ce");
        list.add("ce2");
        list.add("ce");
        list.add("ce");
        list.add("ce1");
        list.add("ce5");
        System.out.println(list.size());
        List<String> noReList = new ArrayList<>(new LinkedHashSet<String>(list));
        List<String> li2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(noReList);
    }
}
