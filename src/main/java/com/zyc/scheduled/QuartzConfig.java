package com.zyc.scheduled;


import com.zyc.scheduled.task.OneJob;
import com.zyc.scheduled.task.TwoJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class QuartzConfig {



    @Bean
    public Scheduler scheduler() throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail oneJob = JobBuilder.newJob(OneJob.class).withIdentity("job1", "group1").build();
        JobDetail secondJob = JobBuilder.newJob(TwoJob.class).withIdentity("job2", "group2").build();

        TriggerBuilder<Trigger> newTrigger = trigger();

        newTrigger.withIdentity("trigger1", "group1");
        newTrigger.withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"));
        Trigger oneTrigger = newTrigger.build();

        newTrigger.withIdentity("trigger2", "group2");
        newTrigger.withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?"));
        Trigger secondTrigger = newTrigger.build();

        scheduler.scheduleJob(oneJob, oneTrigger);
        scheduler.scheduleJob(secondJob, secondTrigger);
        scheduler.start();
        return scheduler;
    }

    @Bean
    public TriggerBuilder<Trigger> trigger() {
        return TriggerBuilder.newTrigger();
    }


}