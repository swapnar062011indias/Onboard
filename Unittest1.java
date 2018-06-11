
package onboard;
 
import java.util.concurrent.TimeUnit;
 
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unittest1 {
	 	private static FirefoxDriver driver;
                
		WebElement element;
    @BeforeClass
     public static void openBrowser()
     {
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }	
     
     @Test
     public void valid_UserCredential(){
 
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("onboard url");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuser_3");
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
	     try{
			 element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		 }catch (Exception e){
			}
	     Assert.assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
 
    @Test
     public void inValid_UserCredential()
     {
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("onboard url");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuser");
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
	     try{
			element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
	     }catch (Exception e){
			}
	     Assert.assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
 
@Test
         
         public void upload(){
             
         
 driver.get("baseurl/file_upload");
      WebElement upload = driver.findElement(By.id("myfile"));
      upload.sendKeys("~/mypicture.jpg");
      driver.findElement(By.id("submit")).click();
      driver.findElement(By.tagName("img"));
      Assert.assertEquals("mypicture.jpg (image/jpeg)", driver.findElement(By.tagName("p")).getText());
         }
         
public void configurationelement()
{
  driver.get("url");
  
  String changeview []={"view1","view2","view3"};
  
//to verify the different views in configuration page, assuming view id is iterate value//
  for(int j=0;j<=10;j++){
      
  String j1=Integer.toString(j);
      
  for(String h:changeview)
  {
      
  
  
driver.findElement(By.id(j1)).click();
  
  WebElement element2 = driver.findElement(By.id("id2"));
if (element2.isEnabled()){
    
    System.out.println("added field1 button from upload is successfull");
}

    WebElement element3 = driver.findElement(By.id("id3"));
    
    if(element2.isDisplayed())
    {
        System.out.println("added field3 from upload is successfull");
    }
    
    WebElement element4 = driver.findElement(By.id("id4"));
    if(element4.isSelected())
    {
      System.out.println("added field4 from upload is successfull");  
    }
    
   

  }
}
}

@Test
public void createcustomer(){
    
    driver.get("url");
    driver.findElement(By.id("id4")).sendKeys("kj");
    driver.findElement(By.id("id5")).sendKeys("nb");
    driver.findElement(By.id("id6")).click();
    
    Assert.assertEquals("customerrecord", driver.findElement(By.tagName("p")).getText());
         }
    
}




