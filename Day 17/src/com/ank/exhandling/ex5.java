package com.ank.exhandling;
import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
  
public class ex5 {  
  
    public static void main(String[] args) {  
          
          
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("ank.txt");   
            pw.println("saved");  
        }  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
    }  
}  