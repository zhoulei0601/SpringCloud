package com.zhou.strategy;

/**
 * @ClassName : MedalTest
 * @Description :
 * @Author : zhoul
 * @Date: 2021-04-02 14:27
 */
public class MedalTest {
    public static void main(String[] args) {
        String medalType  = "guest";
        IMedalService medalService = MedalServiceFactory.getMedalService(medalType);
        medalService.showMedal();
    }
}
