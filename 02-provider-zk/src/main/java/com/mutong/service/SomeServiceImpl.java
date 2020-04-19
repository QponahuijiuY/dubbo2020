package com.mutong.service;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-19 10:19
 * @time_complexity: O()
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("Dubbo world Welcome, " + name);
        return "mutong";
    }
}
