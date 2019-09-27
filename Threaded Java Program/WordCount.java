import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class WordCount
{
  public static void main(String[] args)
  {
	// starts timer
	    long startTime = System.nanoTime();
	// reading in file input
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Please enter a word: ");
	    String wordname1 = scan.next();
	    String wordname2 = scan.next();
	    String wordname3 = scan.next();
	    String wordname4 = scan.next();
	    
	 // Create Tasks
	    Runnable word1 = new CountWord(wordname1, 0, 1);
	    Runnable word2 = new CountWord(wordname2, 0, 2);
	    Runnable word3 = new CountWord(wordname3, 0, 3);
	    Runnable word4 = new CountWord(wordname4, 0, 4);
	    
  
	  // Create Threads
	  Thread thread1 = new Thread(word1);
	  Thread thread2 = new Thread(word2);
	  Thread thread3 = new Thread(word3);
	  Thread thread4 = new Thread(word4);
	 
	 
	  
	  // Start threads
	  thread1.start();
	  thread2.start();
	  thread3.start();
	  thread4.start();	
	  
	// stops timer and measures how long loop took
	    long endTime = System.nanoTime();
	    long totalTime = endTime - startTime;
	    System.out.println("Runtime: " +totalTime/1000000+ " ms");
	    
  }
  
}

// Task is for counting how many words are in found in the file

class CountWord implements Runnable
{
	private String counter;
	private int times;
	private int threadNum;
	
	
// Constructor
	public CountWord(String wordname, int t, int n)
	{
		counter = wordname;
		times = t;
		threadNum = n;
	}
	public void run()
	{
	    String filename = "War and Peace.txt";

		try (LineNumberReader r = new LineNumberReader(new FileReader(filename))) 
	    {
	        String line;
	        // while loop to traverse entire file
	        while ((line = r.readLine()) != null) 
	        {
	        	// determines word from whitespace
	            for (String element : line.split(" ")) 
	            {
	            	// ignores upper and lower
	                if (element.equalsIgnoreCase(counter))
	                {
	                    times++;
	                    
	                }
	            }
	            
	        }
	        	
	        	System.out.println("Thread " +threadNum+" occured " +times+ " times.");
	        	    
	      } 
        
	catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

	

