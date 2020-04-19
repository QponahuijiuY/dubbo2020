package com.mutong.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-19 10:28
 * @time_complexity: O()
 */
public class RunProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
