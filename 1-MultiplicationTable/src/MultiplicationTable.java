/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jakwes
 */
public class MultiplicationTable {
    //generate number that would create multiplication table from 1-10

        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            System.out.print("\n Input a number: ");
            int n = Input.nextInt(); 
            
            for(int i=1; i<=10; i++)
            {
                
            System.out.print ("\n" + n + "x" + i + (n*i));
            }
            
        }
}
