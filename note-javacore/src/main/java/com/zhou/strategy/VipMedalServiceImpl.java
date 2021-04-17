package com.zhou.strategy;

/**
 * @ClassName : VipMedalServiceImpl
 * @Description : VIP勋章策略实现类
 * @Author : zhoul
 * @Date: 2021-04-02 14:20
 */
public class VipMedalServiceImpl implements IMedalService {
    @Override
    public void showMedal() {
        System.out.println("VIP勋章策略实现类");
    }
}
