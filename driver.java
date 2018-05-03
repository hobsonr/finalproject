//driver class launches the main method
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class driver
{
   public static void main(String[] args)
   {
	   String file1 = "test1.txt";
	   try{
		   FileReader file = new FileReader(file1);
		   BufferedReader in = new BufferedReader(file);
       
           String line = in.readLine();
           while (line != null)
           {
		       line = in.readLine();
		       System.out.println(file1);
		       }
		   }
		       catch (IOException e){
				    e.printStackTrace();
			 
	    }
    }
}
