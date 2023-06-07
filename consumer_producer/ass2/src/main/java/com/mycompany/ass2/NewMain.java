/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ass2;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author samoul
 */
public class NewMain {
        
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Enter Number: "); // our range
        Scanner sc =new Scanner(System.in); //take our range from user
        int i  =sc.nextInt();
        //create instances form out classes useing threads
        producer pro = new producer(i);
        Thread thp = new Thread(pro);
        Consumer c = new Consumer(pro);
        Thread thc = new Thread(c);
         thp.start();
         thp.join();
         thc.start();
         thc.join();

    }
    
}
