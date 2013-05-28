package com.sidratul.belajar.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
public class RunProdukJob extends QuartzJobBean {
    private RunProdukTask rpt;

    public void setRpt(RunProdukTask rpt) {
        this.rpt = rpt;
    }

    @Override
    protected void executeInternal(JobExecutionContext jec) throws JobExecutionException {
        rpt.tampilHallo();
    }
}
