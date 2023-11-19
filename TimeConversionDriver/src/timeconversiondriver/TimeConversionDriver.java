package timeconversiondriver;

import java.util.Scanner;

/**
* @author Bruce Long
* ITSC1212-101, Long
* @version 1
* @since 2022-07-27
* Project 2
* This is the driver class for Project 2.
*/
public class TimeConversionDriver {

    public static void main(String[] args) {

        // statements for output formatting
        System.out.println("*******************************");
        System.out.println("Start - Time Conversion Program");
        System.out.println("*******************************");


        // variable to store user input   
        int numSeconds;

        /**
         * TO DO: ask the user to enter the number of seconds to be converted 
         * and assign the value to numSeconds
         */  
        // add your code here
        System.out.println("*************************");
        System.out.println("Enter number of seconds: ");
        System.out.println("*************************");
        
        Scanner scnr = new Scanner(System.in);
        numSeconds = scnr.nextInt();
        scnr.close();

        
        
        // you do not need to add anything below this line
        // create TimeConversion object
        TimeConversion converter = new TimeConversion();

        // call method to calculate Decaseconds
        converter.showDecaseconds(numSeconds);

        // call method to calculate Jeffies
        converter.showJiffies(numSeconds);

        // call method to calculate New York minutes
        converter.showNewYorkMinutes(numSeconds);

        // call method to calculate Nano Centuries 
        converter.showNanoCenturies(numSeconds);

        // call method to calculate Scaramuccis
        converter.showScaramuccis(numSeconds);

        // statements are for output formatting
        System.out.println("*******************************");
        System.out.println("End - Time Conversion Program");
        System.out.println("*******************************");
    }//end main method
}//end class
