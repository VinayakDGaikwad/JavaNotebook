/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author vdg
 */
public class genericEvenodd {

    static boolean isPrime(int number){
      boolean flag = false;
      
      for(int i = 0; i < number; i++ ){
          if (i % number == 0){
              flag = true;              
              break;
          }                
      }     
      return flag;
    };
    
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print(isPrime(s));
        
        
    }
}
