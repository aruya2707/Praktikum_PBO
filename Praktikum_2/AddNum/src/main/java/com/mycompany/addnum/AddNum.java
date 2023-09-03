/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addnum;

import java.io.*;

/**
 *<h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that simply adds two given
 * integer numbers and prints the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * 
 * @author alyaa
 */
public class AddNum {
    
    /**
     * This method is udes to add two integers. this is a the simplest from of class method
     * just to show the usage of variouus javadoc Tags
     * @param numA this is the first parameter to addNum method
     * @param numB this is the second parameter to addNum method
     * @return int This returns sum of numA and numB
     */

    public int addNum(int numA, int numB){
        return numA + numB;
    }
    
    /**
     * This is the main method which use of addNum method
     * @param args unused
     * @exception IOException on input error.
     * @see IOException
     */
    
    public static void main(String args[]) throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10, 20);
        
        System.out.println("Sum of 10 and 20 is :" +sum);
    }
}
