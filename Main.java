import java.util.ArrayList;
import java.util.Scanner;

public class Main {


/*

Computer Programming 12 Assignment 1

Copy and paste ALL OF THIS into your Main.java file of the Tokenizer project,
and finish the methods as instructed.


Instructions on submitting your work can be found in "cp12_assignment_1.pdf".

Do not forget to import any additional packages
(troubleshooting which ones you need to import is part of the assignment)!

IF THE MAIN FUNCTION HAS BEEN MODIFIED, I WILL NOT GRADE IT.

*/


    /*
    Phone numbers have an area code, usually one per province; however,
    since British Columbia is so populous, there are at least three in use;
    we will only focus on two, though (604 and 778).

    For example, if the phone number (represented by ss[0]) is 250-111-2222,
    the method should print the following texts:

    Your area code is 250
    Your next three digits are 111
    Your last four digits are 2222


    If the phone number is 604-222-3333,
    the method should print the following texts:

    Your phone number is is 604
    LOCAL AREA CODE DETECTED!
    Your next three digits are 222
    Your last four digits are 3333


    If the phone number is 778-333-5555,
    the method should print the following texts:

    Your area code is 778
    LOCAL AREA CODE DETECTED!
    Your next three digits are 333
    Your last four digits are 5555

    There is no need to check for "correct" user input for this method.

    Consider the nextToken() method in your Tokenizer class. Which version, though? Hmm...

    */
    public static void parsePhoneNumber(String[] ss) {
        Tokenizer t = new Tokenizer(ss[0]);
        System.out.println("Your area code is " + t.nextToken('-'));
        System.out.println("LOCAL AREA CODE DETECTED!");
        System.out.println("Your next three digits are " + t.nextToken('-'));
        System.out.println("Your last four digits are " + t.nextToken('-'));

    }

/*
Codons are tokens of THREE alphabet letters at a time in a DNA sequence.
They tell the body which kinds of proteins to make- for building organs and tissues.

IF DNA (represented by ss[1]) is strictly less than 3 characters long,
the method should print "This is not long enough."

Otherwise, the method should print the first five codons.
It is okay if there are less than five.

For example, if DNA is "AB", the method should print the following texts:

This is not long enough.

If DNA is "AGC", the method should print the following texts:

The first five codons are:
AGC

If DNA is "AGCCGAAGCCGAAGCCGA", for example, the method should print:

The first five codons are:
AGC
CGA
AGC
CGA
AGC

Consider the nextToken() method in your Tokenizer class. Which version, though? Hmm...
*/

    public static void codonsVer1(String[] ss) {
        Tokenizer t = new Tokenizer(ss[1]);
        if (ss[1].length() < 3){
            System.out.println("This is not long enough");
        }
        else {
            System.out.println("The first five codons are:");
            for (int i = 0; i < 5; i++) {
                System.out.println(t.nextToken(3));
            }
        }

    }

    /*
    Alternatively, how can you use one of the allTokens() method to print the first five codons?
    BOTH codonsVer1 AND codonsVer2 WILL BE GRADED.
    */
    public static void codonsVer2(String[] ss) {
        Tokenizer t = new Tokenizer(ss[1]);
        if (ss[1].length() < 3){
            System.out.println("This is not long enough");
        }
        else {
            System.out.println("The first five codons are:");
            System.out.println(t.allTokens(3) );
        }
    }

    /*
    Have you noticed how Microsoft Word counts words in the document for you?
    English words are "tokens" too, and we have just the tool we need.
    But, since we cannot use a space, we will use the forward slash ('/') instead, so that
    our text will be something like this:

    Notice/that/all/the/words/are/separated/by/a/forward/slash?


                                                                                                                            Use allTokens() to count how many words are in a given English text, represnted by ss[2],
    and then print it using System.out.println. So, for example, with the above input
    (i.e. Notice/that/all/the/words/are/separated/by/a/forward/slash?), the program
    should print the following:

    There are 11 words in your text.

    Hint: ArrayLists have a size() method that would come in very handy here. Also, allTokens().

    */
    public static void wordCount(String[] ss) {
        Tokenizer t = new Tokenizer(ss[2]);
        t.allTokens('/');




    }

    //PLEASE LEAVE THE MAIN METHOD AS IT IS.
    public static void main(String[] args) {
        parsePhoneNumber(args);
        codonsVer1(args);
        codonsVer2(args);
        wordCount(args);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any key to continue...");
        String s = sc.nextLine();
        return;
    }
}