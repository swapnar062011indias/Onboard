package excelExportAndFileIO;

import static com.google.common.collect.ComparisonChain.start;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import  java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.*;

import java.io.File;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;



import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class upload {
    
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        String baseUrl = "http:// /test/upload/";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        
        uploadElement.sendKeys("C:\\upload.file");
 long start = System.currentTimeMillis();

//testing the load time //

WebElement element = driver.findElement(By.id("ID of some element on the page which will load"));
long finish = System.currentTimeMillis();
long totalTime = finish - start; 
System.out.println("Total Time for page load - "+totalTime);
        
        driver.findElement(By.id("terms")).click();

       
        driver.findElement(By.name("send")).click();
        
    
    
    
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swapna
 */

    /**
     *
     * @author swapna
     * @param filePath
     */

    /**
     *
     * @author swapna
     * @param filePath
     * @param sheetName
     */

    /**
     *
     * @author swapna
     * @param filePath
     * @param fileName
     * @param sheetName
     */

    /**
     *
     * @author swapna
     * @param filePath
     * @param fileName
     * @param sheetName
     * @throws java.io.IOException
     */
    }
    
    public void readexcelsheet(String filePath,String fileName,String sheetName) throws IOException{
        
        
        DesiredCapabilities cap=DesiredCapabilities.firefox();
        cap.setPlatform(Platform.WINDOWS);
        URL url=new URL("http://localhost:4444/wd/hub");
        WebDriver driver=new RemoteWebDriver(url, cap);
        driver.get(" ");
        
        
        File file=new File(filePath+"\\"+fileName);
        
        
        FileInputStream inputstream=new FileInputStream(file);
        
        Workbook bookname=new HSSFWorkbook(inputstream);
        Sheet sheetname=bookname.getSheet(sheetName);
        int countrow=bookname.getLastRowNum()-bookname.getFirstRowNum();
        
        for(int i=0;i<=countrow;i++)
        {
            
            Row row=bookname.getRow(i);
            
            
            
            for(int j=0;j<=row.getlastCellNum();j++)
            {
                
                String g=row.getCell(j).getStringCellValue()+"||";
                
                
                driver.get("url");
                

            driver.findElement(By.id("send")).sendKeys(g);
            
            WebElement TxtBoxContent = driver.findElement(By.id(" "));
TxtBoxContent.getText();

if(TxtBoxContent.equals(g))
{

System.out.println("field is uploaded successfully");
}

else 
{
        
       System.out.println("field is  NOt uploaded successfully");
        }
        }
        
    

        
    
    
   
    
    
    
}

    
    
    
}
}
