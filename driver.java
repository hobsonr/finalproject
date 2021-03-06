//driver class launches the main method
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.*; //for scanner, arraylist and replace
import java.io.IOException;
import java.lang.Object;

/**
 * the driver class reads in all 5 files into two array lists
 * each unique word is inputted into the wordcount arraylist 
 * each occurance of a word is counted in the counter arraylist
 * all punctuation is  replaced with a blank space so it will not be counted
 * the results are then printed
 **/
public class driver
{
   public static void main(String[] args) throws IOException
   {
	   //loop to read all five text files
	   for(int a = 1; a<6; a++){
		   
		   //create input stream and scanner
		   FileInputStream f = new FileInputStream("test"+a+".txt");
		   Scanner file = new Scanner(f);
        
           //print the heading of each file before printed results
           System.out.println("\n");
           System.out.println("test"+a+".txt");
     
           //Create the Arraylists
           ArrayList<String> wordcount = new ArrayList<String>();
           ArrayList<Integer> counter = new ArrayList<Integer>();

           //Read through file and find words
           while(file.hasNext()){
			   //get next word
			   String nextWord = file.next();
               //System.out.println(next.toLowerCase());
          
              //replace punctuation with blank space and sets all words to lowercase
              nextWord = nextWord.replace(".","");
              nextWord = nextWord.replace(",","");
              nextWord = nextWord.replace("-","");
              nextWord = nextWord.replace("'","");
              nextWord = nextWord.replace("\"","");
              nextWord = nextWord.toLowerCase();
              
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
