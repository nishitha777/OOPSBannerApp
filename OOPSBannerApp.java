/**
 * OOPSBannerApp UC4 - Render OOPS as banner using String Array and Loop
 * 
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with  a for-loop, elimating hardcoded print
 * statements and improving modularity and resuability
 *  
 * @author Nishitha
 * @version 4.0 
 *  */

// Extend the user story 3 to futhure develop the OOPS banner
// by using String array to store the banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines 
// and iterating through them with a for-loop, eliminating hardcoded print statements 
// and improving modularity and reusability. 
// Each line of the banner is stored as an element in the array, 
// and the loop iterates through the array to print each line, creating the visual effect for the message "OOPS". 
// This approach enhances code maintainability and readability while achieving the same output as UC3.

public class OOPSBannerApp { 
    // Main method to run banner display
    // Each Character represented in a 7-line format and a width of 9 characters, aligned properly
    // Each line of the banner is stored as an element in the array and use String.join(), 
    // and the loop iterates through the array to print each line, creating the visual effect for the message "OOPS". 
    // String.join() method for better readability and efficiency.
    // Each line corresponds to a row in the banner for the letters O, O, P, S. 
    //
    public static void main(String[] args) {
         // Line 1
        String[] bannerLines = new String[7];
        bannerLines[0] = String.join("","   ***   " , "   ***   " , " ******  " , "  *****  ");
        bannerLines[1] = String.join("","  **  ** " , "  **  ** " , " **   ** " , " **      ");
        bannerLines[2] = String.join(""," **    **" , " **    **" , " **   ** " , " **      ");
        bannerLines[3] = String.join(""," **    **" , " **    **" , " ******  " , "  *****  ");
        bannerLines[4] = String.join(""," **    **" , " **    **" , " **      " , "       **");
        bannerLines[5] = String.join("","  **  ** " , "  **  ** " , " **      " , " **    **");
        bannerLines[6] = String.join("","   ***   " , "   ***   " , " **      " , "  *****  ");

        // Loop through the banner lines and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }        

    }
}
