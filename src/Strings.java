/*Joohan Kim
Import java.util.* which imports the Scanner and the Array
Create scanner object
In the public static void main, make the integer variable that is the number of words the user types in
Create a do while loop for the user so that they can type the number of words
    using the while, set the wordAmount from 1 to 10
make do loop
create print statement for user of how many words they want to print
define the word amount from 1-10
then create code so user can print the word
create for loop to control the wordamount
 Then create a method called output
Intitalize a variable for the even and off words
create for loop even Index
create for loop odd Index
Create a for loop for the even index
Create a for loop for the odd index
create return method that will be the output statement
 */
import java.util.Scanner;

public class Strings {
    // this sets up the scanner
    public static Scanner Keyboard = new Scanner (System.in);
    public static void main(String[] args) { //main
        int wordAmount;
        // this loop asks for the number of words and makes sure it's between 1 and 10
        do {
            //print statement and scanner object  for how many words for user
            System.out.println("How many words will you type?");
            wordAmount=  Keyboard.nextInt();
        }
        while (wordAmount < 1 || wordAmount> 10);
// creates a system for word typed
        for (int method = 1; method <= wordAmount; method++) {//for loop with int for control
            // print statemment for user to send to the method
            System.out.println("Print the Word");
            String Wordcount = Keyboard.next();
            if (Wordcount .length() >= 2) {
                String words = output(Wordcount);//return from the method
                System.out.println(words);
            }
        }
    }
    public static String output (String wordinput){
        //intializes the variable
        String evenword = "";
        String oddword= "";
        int wordlength=  wordinput.length();// number of indexes in word
        //for loop for even index and skips every two indexes starting at 0
        for (int evenIndex=0; evenIndex<=wordlength-1;evenIndex=evenIndex+2){
            char evenoutput = wordinput.charAt(evenIndex);
            //this sets the variable for even word
            evenword=evenword+evenoutput;
        }
        //for loop for odd index and skips every two indexes starting at 1
        for (int oddIndex=1; oddIndex<=wordlength-1; oddIndex=oddIndex+2){
            char oddoutput= wordinput.charAt(oddIndex);
            //this sets the variable for odd word
            oddword=oddword+oddoutput;
        }
        //return statement that will be the output statement
        return evenword + " " + oddword;
    }
}