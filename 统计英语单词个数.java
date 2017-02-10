/**
 * 
 * @author ztx
 */

import java.io.FileReader;

import org.junit.Test;

/**
 * 单词不是字母！
 * @param ztx
 * @return
 */
public class 统计英语单词个数 {

	@Test
	public void count(){
	     try(FileReader fr = new FileReader("C:\\javacode\\面试题\\files\\article.txt")) {  
	        int counter = 0;  
	        boolean state = false;  
	        int currentChar;  
	        while((currentChar= fr.read()) != -1) {  
	          if(currentChar== ' ' || currentChar == '\n'  
	             || currentChar == '\t' || currentChar == '\r') {  
	             state = false;  
	          }  
	          else if(!state) {  
	             state = true;  
	             counter++;  
	          }  
	        }  
	        System.out.println(counter);  
	     }  
	     catch(Exception e) {  
	        e.printStackTrace();  
	     }  
	   }
}
