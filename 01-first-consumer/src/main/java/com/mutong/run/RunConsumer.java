package com.mutong.run;

import com.mutong.service.SomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-19 10:35
 * @time_complexity: O()
 */
public class RunConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        someService.hello("Tom");
    }
}
