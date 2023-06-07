/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ass2;
    
import java.io.*;
/**
 *
 * @author samoul
 */


class Consumer extends Thread {
  
     PrintWriter outputfile ; //initalize file to write in
     producer prod;      //take an instance form producer so we can add elems into file 
   public Consumer(producer prod) throws IOException
   {
         this.prod = prod;
         outputfile = new PrintWriter("output.txt");
   }

    
    @Override
    public void run() {
          outputfile.print(prod.primeNums); //add prime nums into output file 
          outputfile.flush();
  }
}

