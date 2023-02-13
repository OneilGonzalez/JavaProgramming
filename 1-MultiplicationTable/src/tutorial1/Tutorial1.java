/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

//write the program theory 

import java.util.Scanner;


/**
 *
 * @author Jakwes
 */
public class Tutorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in); // creates a new scanner
        System.out.print("\n Enter a Number: "); // the message
        int n = input.nextInt(); //data type.
        
        for(int i=1; i<=10; i++)
        {
            System.out.print("\n " + n + " x " + i + " = " + (n*i));
        }
        input.close();   
    }
    
}
