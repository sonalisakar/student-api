package com.bksoft.studentapi.jobs;

import com.bksoft.studentapi.excel.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StudentScheduler {

    @Autowired
    private ReadExcel readExcel;

    //@Scheduled(cron="0 */2 * * * *")
    public void scheduleStudentDataValidation() throws IOException {
        readExcel.read();
    }
}
