package com.zhou.strategy;


/***
* @description TODO
* @Param
 *
 *策略模式+工厂方法优化冗余的if else
 *  String medalType = "guest";
 *     if ("guest".equals(medalType)) {
 *         System.out.println("嘉宾勋章");
 *      } else if ("vip".equals(medalType)) {
 *         System.out.println("会员勋章");
 *     } else if ("guard".equals(medalType)) {
 *         System.out.println("展示守护勋章");
 *     }
 *
* @return
* @throws
*/
public interface IMedalService {
    void showMedal();
}
