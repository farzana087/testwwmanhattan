package ABC.abc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Sample_TestMaps{
	
	public static String firstItem="//span[contains(@class,'title ng-binding')][text()='Apple butter']";
	public static String firstServings="//span[contains(@class,'description ng-binding')][text()='1 Tbsp']";

	public static String SecondItem="//span[contains(@class,'title ng-binding')][text()='Apple(s) fresh']";
	public static String SecondServing="//span[contains(@class,'description ng-binding')][text()='1 medium']";

	public static String ThirdItem="//span[contains(@class,'title ng-binding')][text()='Applesauce,unsweetened']";//---3rd item
	public static String ThirdServing="//span[contains(@class,'description ng-binding')][text()='1/2 cups']";

	public static String FourthItem="//span[contains(@class,'title ng-binding')][text()='Apple(s),dried']";
	public static String FourthServing="//span[contains(@class,'description ng-binding')][text()='1/4 cup(s)']";

	public static String FifthItem="//span[contains(@class,'title ng-binding')][text()='Juice,Cranberry-apple drink']";//----5th item
	public static String FifthServing="//span[contains(@class,'description ng-binding')][text()='8 fl oz']";

	
	
  public static void main(String[] args){
	  
/*	WebDriver driver=new FirefoxDriver();
	driver.get("URL");
	
	//Third item
	
	String thirditem=driver.findElement(By.xpath(ThirdItem)).getText();
	String thirdserving=driver.findElement(By.xpath(ThirdServing)).getText();
	System.out.println(thirditem +"" +thirdserving);
	
	//Fifth item
	
	String fifthitem=driver.findElement(By.xpath(FifthItem)).getText();
	String fifthserving=driver.findElement(By.xpath(FifthServing)).getText();
	System.out.println(fifthitem+""+fifthserving);
	
	
	//all other items for creating a map
	String firstitem=driver.findElement(By.xpath(firstItem)).getText();
	String firstserving=driver.findElement(By.xpath(firstServings)).getText();
	String seconditem=driver.findElement(By.xpath(SecondItem)).getText();
	String secondserving=driver.findElement(By.xpath(SecondServing)).getText();
	String fourthitem=driver.findElement(By.xpath(FourthItem)).getText();
	String fourthserving=driver.findElement(By.xpath(FourthServing)).getText();
	
	
	
	//Direct Storing
	Map<String, String> mapelement = new HashMap<String, String>();
    mapelement.put(firstitem, firstserving);
    mapelement.put(seconditem, secondserving);
    mapelement.put(thirditem, thirdserving);
    mapelement.put(fourthitem, fourthserving);
    mapelement.put(fifthitem, fifthserving);
    System.out.println("Elements of the Map:");
    System.out.println(mapelement);*/
   
	  // Indirect storing key value pairs in a map
	  
	
	Map<String, String> mapelement1 = new HashMap<String, String>();
    mapelement1.put("Apple butter", "1 Tbsp\n");
    mapelement1.put("Apple(s) fresh", "1 medium\n");
    mapelement1.put("Applesauce, unsweetened", "1/2 cup(s)\n");
    mapelement1.put("Apple(s), dried", "1/4 cup(s)\n");
    mapelement1.put("Juice, Cranberry apple drink", "8 fl oz\n");
    System.out.println("Elements of the Map:");
    System.out.println(mapelement1);
    
    //Iterating and retrieving map elements
    System.out.println("Interating through elements : \n");
    
    Iterator it = mapelement1.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry retrieveValues = (Map.Entry)it.next();
        System.out.println(retrieveValues.getKey() + " = " + retrieveValues.getValue());
        it.remove(); // To avoid a ConcurrentModificationException
    }
  }
}