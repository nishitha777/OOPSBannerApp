/**
 * OOPSBannerApp UC3 - OOPS Banner Appplication memory optimization using string.join() method
 * 
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhancing code readability and effciency
 * by utilizing the String.join() method to create each line of the banner.This approach
 * overcomes the drawback of using the + operator for string concatenation, which can lead
 * to code inefficency due to the creation of multiple intermediate String Objects in memory
 * 
 * 
 * @author Nishitha
 * @version 3.0 
 *  */

// Extend use case UC2 to use String.join() method to create each line of the "OOPS" banner
// instead of concatenating strings with the + operator. This is essentially to overcome the
// drawback of using the + operator for string concatenation, which essentially creates 
// multiple intermediate String objects in memory, leading to inefficiency. 


public class OOPSBannerApp { 
    // Main method to run banner display
    // Each Character represented in a 7-line format and a width of 9 characters, aligned properly
    // Use System.println() to print each line of the OOPS banner to create
    // the visual effect for the message "OOPS". Construct each line using
    // String.join() method for better readability and efficiency.
    // Each line corresponds to a row in the banner for the letters O, O, P, S. 
    //
    public static void main(String[] args) {

        String line1 = String.join(" ", "*****", "*****", "*****", "*****");
        String line2 = String.join(" ", "*   *", "*   *", "*   *", "*   *");
        String line3 = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        String line4 = String.join(" ", "*   *", "*   *", "*   *", "*****");
        String line5 = String.join(" ", "*   *", "*   *", "*   *", "    *");
        String line6 = String.join(" ", "*   *", "*   *", "*   *", "*   *");
        String line7 = String.join(" ", "*****", "*****", "*****", "*****");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}
