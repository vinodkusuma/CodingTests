/**
 * 
 */
package com.pickyourtrail.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vinod
 *
 */
public class PalindromeSubString  {
	public static List<String> palindromeSubstring(String s) throws ArrayIndexOutOfBoundsException
    { 
        List<String> list = new ArrayList<String>(); 
  
        // moving the pivot from starting till end of the string 
        for (float pivot = 0; pivot < s.length(); pivot += .5) { 
  
            // set radius to the first nearest element 
            // on left and right 
            float palindromeRadius = pivot - (int)pivot; 
  
            // if the position needs to be compared has an element 
            // and the characters at left and right matches 
            while ((pivot + palindromeRadius) < s.length() 
                   && (pivot - palindromeRadius) >= 0
                   && s.charAt((int)(pivot - palindromeRadius)) 
                          == s.charAt((int)(pivot + palindromeRadius))) { 
  
                list.add(s.substring((int)(pivot - palindromeRadius), 
                                     (int)(pivot + palindromeRadius + 1))); 
  
                // increasing the radius by 1 to point to the 
                // next elements in left and right 
                palindromeRadius++; 
            } 
        } 
  
        return list; 
    } 
  
   
    public static void main(String[] args) 
    { 
    	try {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("please enter a string");
        List<String> list = palindromeSubstring(scanner.next()); 
        System.out.println(list.size()); 
    	}catch(ArrayIndexOutOfBoundsException ex) {
        	ex.printStackTrace();
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
}
