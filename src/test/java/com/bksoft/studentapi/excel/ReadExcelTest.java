package com.bksoft.studentapi.excel;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadExcelTest {

    @Test
    public void testExcelRead() throws IOException {
        ReadExcel excel = new ReadExcel();
        //"D:\samina-projects\student-api\student-api\student.xlsx"
        excel.read();
    }

}