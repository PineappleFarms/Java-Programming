package timeconversiondriver;

/**
 * @author Diego Lopez ITSC1212-101, Long
 * @version 1
 * @since 2022-09-19 Project 2 This is the TimeConversion class methods required
 * for Project 2.
 */
public class TimeConversion {

    /**
     * Constructor
     */
    TimeConversion() {
    }

    /**
     * TO DO: showDecaseconds method Given a number of seconds calculates and
     * display decaseconds
     */
    // add your code here
    public void showDecaseconds(int numSeconds) {

        //calculate Decaseconds
        double decaseconds = (numSeconds / 10.0);
        
        // Decaseconds description and conversion print statements
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("A Decasecond is ten seconds.");
        System.out.print(numSeconds + " Seconds is " + decaseconds);
        System.out.println(" Deca Seconds.");
        System.out.println("*************************************");
        System.out.println("");
    }

    /**
     * TO DO: showJiffies method Given a number of seconds calculates and
     * display jiffies
     */
    // add your code here
    public void showJiffies(int numSeconds) {

        // calculate Jiffies
        int jiffies = ((numSeconds * 1000) / 10);

         // Jiffies description and conversion print statements
        System.out.println("***************************************");
        System.out.println("A jiffy is a unit of time used in");
        System.out.println("computer operating systems.");
        System.out.println("It is 10 milliseconds.");
        System.out.println(numSeconds + " Seconds is " + jiffies + " Jiffies.");
        System.out.println("***************************************");
        System.out.println("");
    }

    /**
     * F
     * TO DO: showNewYorkMinutes method Given a number of seconds calculates and
     * display New York minutes
     */
// add your code here
    public void showNewYorkMinutes(int numSeconds) {

        // calculate New York Minutes
        int newYorkMinutes = (numSeconds * 20);

         // New York Minutes description and conversion print statements
        System.out.println("**********************************************");
        System.out.println("A New York Minute is the period of time");
        System.out.println("between a traffic light turning green and the");
        System.out.println("cab behind you honking.");
        System.out.println("It is 1/20th of 1 second.");
        System.out.print(numSeconds + " Seconds is " + newYorkMinutes);
        System.out.println(" New York Minutes.");
        System.out.println("**********************************************");
        System.out.println("");
    }

    /**
     * TO DO: showNanoCenturies method Given a number of seconds calculates and
     * display NanoCenturies
     */
    // add your code here
    public void showNanoCenturies(int numSeconds) {

        // calculate Nano Centuries 
        double nanoCenturies = (numSeconds / 3.156);

         // Nano Centuries description and conversion print statements
        System.out.println("**********************************************");
        System.out.println("A NanoCentury is a computing measurement");
        System.out.println("coined from the expression -  \"never to let ");
        System.out.println("the user wait more than a few Nano Centuries ");
        System.out.println("for a response\".");
        System.out.println("It is 3.156 seconds.");
        System.out.printf(numSeconds + " Seconds is %.2f", nanoCenturies);
        System.out.println(" Nano Centuries.");
        System.out.println("**********************************************");
        System.out.println("");
    }

    /**
     * TO DO: showScaramuccis method Given a number of seconds calculates and
     * display Scaramuccis
     */
    // add your code here
    public void showScaramuccis(int numSeconds) {
        
        // calculate Scaramuccis
        double scaramucci = numSeconds / (((11 * 24) * 60) * 60);
        
         // Scaramuccis description and conversion print statements
        System.out.println("**********************************************");
        System.out.println("A Scaramucci is the tenure of former  White ");
        System.out.print("House Communications Director ");
        System.out.println("Anthony Scaramucci.");
        System.out.println("It is 11 days.");
        System.out.print(numSeconds + " Seconds is " + scaramucci);
        System.out.println(" Scaramuccis.");
        System.out.println("**********************************************");
        System.out.println("");
    }

}//end class
