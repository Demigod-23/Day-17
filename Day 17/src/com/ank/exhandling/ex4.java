package com.ank.exhandling;
public class ex4 {  
	  
    public static void main(String[] args) {  
        try  
        {  
        int arr[]= {1,3,5,7,9};  
        System.out.println(arr[7]);    
        }   
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  