/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ass2;


import java.util.ArrayList;
/**
 *
 * @author samoul
 */

public class producer extends Thread {
     ArrayList<Integer> primeNums = new ArrayList(); //inialize arr to store prime nums
     private int Range;
    public producer(int Range)
    {
     this.Range = Range;
    }     
    @Override
	public synchronized void run()
        {//to calc prime nums in our range and add it to arraylist a
	    int num = 0;
	     for (int i = 1; i <= Range; i++) {
	         int counter = 0;
		    for (num = i; num >= 1; num--) {
		        if (i % num == 0) {
                            counter = counter + 1;
                           }
                        }
			if (counter == 2) {
                          primeNums.add(i);
                        }
                   
                }
	  System.out.println("Number of generated elements: "+primeNums.size());//numbers of elems
          System.out.println("the prime largest prime num in range of Numbers: "+primeNums.get(primeNums. size()-1)); //largest number in list 
    }
}

