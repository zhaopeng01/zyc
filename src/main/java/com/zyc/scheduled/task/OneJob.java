package com.zyc.scheduled.task;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/*
 *
 * @DisallowConcurrentExecution 只有在第一个任务执行完成后才会执行第二个任务
 *
 * @Description:
 * @author zhaopeng
 * @email zp152527@163.com
 * @date 2018/8/11 15:26
 *
 */

@DisallowConcurrentExecution
public class OneJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            Thread.sleep(6000);
            System.out.println("*********************1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
