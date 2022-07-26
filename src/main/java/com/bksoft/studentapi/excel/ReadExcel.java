package com.bksoft.studentapi.excel;

import com.bksoft.studentapi.model.Student;
import com.bksoft.studentapi.service.StudentService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Component
public class ReadExcel {

    @Autowired
    private StudentService studentService;

    public void  read() throws IOException {
        FileInputStream fis=
                new FileInputStream(new File("D:\\samina-projects\\student-api\\student-api\\student.xlsx"));
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheetAt(0);

        int rowCount=0;
        for(Row row:sheet){
            if(rowCount==0){
                rowCount++;
                continue;
            }
            String stdname = row.getCell(0).getStringCellValue();
            Student student = Student.builder().name(stdname).build();//Create an object of student with value of student name
            studentService.insertStudent(student);
        }
    }

}
