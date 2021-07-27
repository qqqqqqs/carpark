package com.carpark;
/*
这里是添加日志的类
 */

import com.carpark.pojo.AdminTable;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

   // private final Logger logger = LoggerFactory.getLogger(LogTest.class);


    @Test
    public void test(AdminTable admin) {
            int   test=admin.getAdminId() ;
        String password =admin.getAdminPwd();
        log.debug("debug...");
        log.info("name：{}, password：{}",test,password);
        log.info("info...");
        log.error("error...");
        log.warn("warning...");
    }
}
