/*
 * Peter Horne-Deus
 * PurchaseSavings.java
 * This a program that creates savings calculations based on how much a person spent
 * October 5,2018
 */

package purchasesavings;

import java.util.Scanner;
import java.text.*;

public class PurchaseSavings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$###,###.##");

        //Variables
        double cost,total,savings,savingsPercent;
        
        //Constents
        final double SAVINGS_ONE = 0.10;
        final double SAVINGS_TWO = 0.20;
        final double SAVINGS_THREE = 0.30;
        final double SAVINGS_FOUR = 0.40;
        
        //Geting user input
        System.out.println("Enter how much you spent: ");
        cost =  keyedInput.nextDouble();
        
        //Calculations of user input
        if (cost >= 0.01 && cost <= 40.00){
            savingsPercent = 10;
            savings = cost * SAVINGS_ONE;
            total = cost - (cost * SAVINGS_ONE);
        }
        else if (cost >= 40.01 && cost <= 80.00){
            savingsPercent = 20;
            savings = cost * SAVINGS_TWO;
            total = cost - (cost * SAVINGS_TWO);
        }
        else if (cost >= 80.01 && cost <= 120.00){
            savingsPercent = 30;
            savings = cost * SAVINGS_THREE;
            total = cost - (cost * SAVINGS_THREE);
        }
        else {
            savingsPercent = 40;
            savings = cost * SAVINGS_FOUR;
            total = cost - (cost * SAVINGS_FOUR);
        }
        
        //Giving output
        System.out.println("You have spent: " + money.format(cost));
        System.out.println("You get: " + savingsPercent + "% Off");
        System.out.println("You save: " + money.format(savings));
        System.out.println("Total is: " + money.format(total));
        
        //Closing Program
        keyedInput.close();
    }
    
}
