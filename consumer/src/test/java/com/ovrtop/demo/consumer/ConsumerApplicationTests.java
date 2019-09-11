package com.ovrtop.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ovrtop.demo.provider.api.service.IDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {
    @Reference
    private IDemoService demoService;
    private Logger logger = LoggerFactory.getLogger("ConsumerApplicationTests");
    @Test
    public void contextLoads() {
        String result = demoService.sayHello("jeason");
        logger.info("--------------------------------" + result);
    }

}
