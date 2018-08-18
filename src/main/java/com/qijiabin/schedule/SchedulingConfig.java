package com.qijiabin.schedule;

import com.qijiabin.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class SchedulingConfig {

    @Autowired
    private TaskService taskService;
   
    @Scheduled(cron = "0/5 * * * * ?") // 每5秒执行一次
    public void scheduler() {
        log.info(">>>>>>>>> SchedulingConfig.scheduler()");
        taskService.execute();
    }
    
}