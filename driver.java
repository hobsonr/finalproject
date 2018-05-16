//driver class launches the main method
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.*; //for scanner and arraylist
import java.io.IOException;

public class driver
{
   public static void main(String[] args) throws IOException
   {
	  //loop to read all five text files
	  for(int a = 1; a<6; a++){
		  
        //create input stream and scanner
        FileInputStream f = new FileInputStream("test"+a+".txt");
        Scanner file = new Scanner(f);
        
        System.out.println("test"+a+".txt");
     
        //Create the Arraylists
        ArrayList<String> wordcount = new ArrayList<String>();
        ArrayList<Integer> counter = new ArrayList<Integer>();

        //Read through file and find words
        while(file.hasNext()){
          //get next word
          String nextWord = file.next();
          
          //determine if the word is in the array list already
          if(wordcount.contains(nextWord)){
            //find the index the word is located at, goes to counter array list, increases counter by 1 each time the word is found
            int index = wordcount.indexOf(nextWord);
            counter.set(index, counter.get(index)+1);
            }
          
        //if a new word has been found, set the counter to 1
          else{
            wordcount.add(nextWord);
            counter.add(1);
            }
          }
        
          f.close();
          file.close();

          //print the results
          for(int i = 0; i < wordcount.size(); i++){
            System.out.println(wordcount.get(i)+" counted "+ counter.get(i) + " time(s)");
	    }
       }
      }
    }
