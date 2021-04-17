package com.zhou.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : MedalServiceFactory
 * @Description : 策略工厂类
 * @Author : zhoul
 * @Date: 2021-04-02 14:22
 */
public class MedalServiceFactory {
    private static final Map<String,IMedalService> map = new HashMap<>(3);

    static {
        map.put("guest",new GuardMedalServiceImpl());
        map.put("guard",new GuardMedalServiceImpl());
        map.put("vip",new VipMedalServiceImpl());
    }

    public static IMedalService getMedalService(String medalType){
        return map.get(medalType);
    }
}
