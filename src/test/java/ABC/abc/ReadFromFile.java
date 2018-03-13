package ABC.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
	//public static String filepath="C:\\Users\\mitul\\eclipse-workspace\\abc\\Dictionary.txt";
	
	public static void checkFile ()
	{
		 System.out.println("Checking if file exists or not : \n");	
	try {
		String filelocation=System.getProperty("user.dir");
		
		//System.out.println(filelocation);
		String basePath = new File("").getAbsolutePath();
	    //System.out.println(basePath);
		// define two strings
		String firstName = basePath;
		String lastName  = "\\Dictionary.txt";
		// concatenate the strings
		String filepath  = firstName + lastName;
		System.out.println("Location of the file is : "+filepath);
	File f = new File(filepath);
			if(f.exists() && !f.isDirectory()) { 
			    System.out.println("Great ! File is existing\n");
			}
	} catch (Exception e)
	{
		System.out.println("Sorry ! File is not existing\n");
	}
	}
	

public static void main(String[] args) throws Exception
{
	
    checkFile();
    System.out.println("Content of the file : \n");
     String sCurrentLine;
     BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\mitul\\eclipse-workspace\\abc\\Dictionary.txt"));//file name with path

        while ((sCurrentLine = br1.readLine()) != null) 
        {

            for(int i=0; i<sCurrentLine.length(); i++)
            {
            	String delimiters = "\n,\n;";
                for(int j=0; j<delimiters.length(); j++)
                {
                    if(sCurrentLine.charAt(i) == delimiters.charAt(j))
                    {
                        int startIndex = 0;
                        int endIndex = i;

                        String subStr=sCurrentLine.substring(startIndex, endIndex);
                        System.out.println(subStr);
                        String subStr2=sCurrentLine.substring(endIndex+1,sCurrentLine.length());
                        System.out.println(subStr2);
                    }
                }
            }

        }
}

}
