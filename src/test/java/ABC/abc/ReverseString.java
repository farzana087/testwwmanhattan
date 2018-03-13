package ABC.abc;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */

@Test
public class ReverseString 
{
	public static String chrome="C:\\selenium\\chromedriver.exe";
	public static String htmlunit="C:\\selenium\\htmlunit-driver-2.29.2-jar-with-dependencies";
	public static String IE="C:\\selenium\\IEDriverServer.exe";
    public static void main( String[] args ) throws InterruptedException
    {

        // Initializing the given String to be reversed
        String givenString = "hope you are doing well";
        System.out.println("The given String : " +givenString);

        // Empty String to store the reverse string
        String stringAfterReversing = "";
        
        //Finding the length of the given string
        int length = givenString.length();

        // Starting from the last letter of the given string till we get to its first letter
        for(int i=givenString.length()-1; i>=0;i--){

         //Storing the reverse order string
           stringAfterReversing = stringAfterReversing+givenString.charAt(i);
}

        // Displaying the value of reversed string
           System.out.println("The String after Reversing : " +stringAfterReversing);
 
        
    
    }
}



