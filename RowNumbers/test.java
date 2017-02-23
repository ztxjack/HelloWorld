package RowNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class test{ 
public static ItemCount itemCount= new ItemCount();
static int fileCount=0;
static  int lineCount=0;
static  int javafileCount = 0;
    @Test
    public void test01() throws IOException{
    	String path = "C:/javacode_for_flystore/测试类/src";
//    	ItemCount itemCount=new ItemCount();
        //
        getItemLineNum(new File(path));
        System.out.println(path+"\r\n文件总个数"+itemCount.getFileCount()+",Java文件个数"+itemCount.getJavafileCount()+",文件共"+itemCount.getLineCount()+"行代码");
    }
     
    //�ݹ�
    public static void getItemLineNum(File path) throws IOException{
 
    /*
     * 判断是否为文件
     * 	  计数值+1
     * 	 	   	 
     */
        if(path.isFile()){
        	fileCount++;
        	BufferedReader br = new BufferedReader(new FileReader(path));
        	
        	if(path.getName().endsWith(".java")){
            javafileCount++;}
        	
            while(br.readLine()!=null){
                lineCount++;
            }
            
            
            System.out.println(path.getName());
            itemCount.setFileCount(fileCount);
            itemCount.setJavafileCount(javafileCount);
            itemCount.setLineCount(lineCount);
            br.close();
        }else if(path.isDirectory()){
            File[] listFiles = path.listFiles();
            for (File file : listFiles)
            {
                getItemLineNum(file);//递归
            }
        }
       
        
    }
}
