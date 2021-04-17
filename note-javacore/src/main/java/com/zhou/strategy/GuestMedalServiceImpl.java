package com.zhou.strategy;

/**
 * @ClassName : GuestMedalServiceImpl
 * @Description : 守护勋章策略实现类
 * @Author : zhoul
 * @Date: 2021-04-02 14:16
 */
public class GuestMedalServiceImpl implements IMedalService {
    @Override
    public void showMedal() {
        System.out.println("守护勋章实现类");
    }
}
