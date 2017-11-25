package CountWord;

public class SringWordCount {
	
    static int wordcount(String sentence)  
    {  
    	if(sentence == null || sentence.isEmpty())
    	
    	{ return 0; 
    	}
    	
    	String[] words = sentence.split("\\s+"); 
    	
    	return words.length;
    	
    
    }  
  public static void main(String[] args) {  
      String string ="India Is My Country";  
     System.out.println(wordcount(string) + " words.");   
}  
}  
		