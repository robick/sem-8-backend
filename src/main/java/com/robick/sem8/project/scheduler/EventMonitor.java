package com.robick.sem8.project.scheduler;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class EventMonitor implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
       System.out.println("Candidjava welcomes simple job");
    }
}