package com.afiab.dolphinscheduler.server.master;

import org.apache.dolphinscheduler.common.constants.Constants;

/**
 * @Version 1.0
 * @Author ZHANGBAIFA
 * @Date 2023/12/14 16:23
 * @Description:
 */
public class MasterServer {
    public static void main(String[] args) {
        Thread.currentThread().setName(Constants.THREAD_NAME_MASTER_SERVER);
//        SpringApplication.run(MasterServer.class);
    }
}
