import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintAlphabet implements Runnable
{
  @Override
  public void run()
  {
	  
	    for(char i='a';i<='z';i++) {
	    	if (i == 'z')
	    	{
	    		System.out.print(i);
	    		System.out.println(" Thread completed");
	    	}
	    	else
	    	{
		        System.out.print(i+",");
	    	}
	    
  }
}


public static void main(String[] args)
{
  ExecutorService executor = Executors.newCachedThreadPool();
  for (int i = 0; i < 26; i++) executor.execute(new PrintAlphabet());
}
}