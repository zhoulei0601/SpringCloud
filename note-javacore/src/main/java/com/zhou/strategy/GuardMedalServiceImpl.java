package com.zhou.strategy;

/**
 * @ClassName : GuardMedalServiceImpl
 * @Description : 嘉宾勋章策略实现类
 * @Author : zhoul
 * @Date: 2021-04-02 14:19
 */
public class GuardMedalServiceImpl implements IMedalService{
    @Override
    public void showMedal() {
        System.out.println("嘉宾勋章策略实现类");
    }
}
