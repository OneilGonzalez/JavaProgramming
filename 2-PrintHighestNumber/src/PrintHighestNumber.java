/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ladder if or if else if

import java.util.Scanner;

/**
 *
 * @author Jakwes
 */
public class PrintHighestNumber {
// input 3 numbers and find the largest number
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input = new Scanner (System.in);
        System.out.print("\nEnter a number 1: ");
        int n1 = Input.nextInt();
        System.out.print("\nEnter a number 2: ");
        int n2 = Input.nextInt();        
        System.out.print("\n5Enter a number 3: ");
        int n3 = Input.nextInt(); 
        
        
        /*
        if (n1>n2 && n1>n3)
        {
            System.out.println(n1);
        }
        
        else if(n2>n1 && n2>n3)
        {
            System.out.println(n2);
        }
        else
        {
            System.out.println(n3);
        }
        
        if(n1>0)
        {
            if(n1>n2)
            {
                System.out.print(n1);
            }
        }
        */
        //compare 3 variables using nested if largest number nested if
        if(n1>=n2)
        {
            if(n1>=n3)
            {
                System.out.print(n1);
            }
            else
            { 
                System.out.print(n3);
            }
        }
        else
        {
            if(n2>=n3)
            {
                System.out.print(n2);
            }
            else
            {
                System.out.print(n3);
            }
        }
    }
}
