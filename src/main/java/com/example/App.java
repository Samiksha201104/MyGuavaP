package com.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits=ImmutableList.of("apple","banana","mellon");
        System.out.println(fruits);
        File srcf=new File("src.txt");
        File destf=new File("dest.txt");
        try{
        	FileUtils.copyFile(srcf,destf);
        	System.out.println("copy success");
        }
        catch(IOException e)
        {
        	System.out.println("error");
        }        
    }
}
