package com.afiab.dolphinscheduler.server.master;

import lombok.extern.slf4j.Slf4j;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Version 1.0
 * @Author ZHANGBAIFA
 * @Date 2023/12/14 16:23
 * @Description:
 */
@SpringBootApplication
@ComponentScan("com.afiab.dolphinscheduler")
//@EnableTransactionManagement
@EnableCaching
@Slf4j
public class MasterServer {
    public static void main(String[] args) {
        Thread.currentThread().setName(Constants.THREAD_NAME_MASTER_SERVER);
        SpringApplication.run(MasterServer.class);
    }
}
