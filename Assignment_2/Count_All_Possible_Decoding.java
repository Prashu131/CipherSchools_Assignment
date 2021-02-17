package Assignment_2;

import java.util.Scanner;

public class Count_All_Possible_Decoding {
        public static void printAllDecoding(String number, String output) {
        if(number.length() ==0) {
            System.out.println(output);
            return;}
        String firstChar = number.substring(0,1);

        int firstNumber = Integer.parseInt(firstChar);
        if(firstNumber!= 0)
        {
            char character = (char)('a'+ firstNumber-1);
            printAllDecoding(number.substring(1),output+character);
        }
        if(number.length() <=1)
        {
            return;
        }
        String firstTwoCharacters = number.substring(0,2);
        int firstTwoNumber = Integer.parseInt(firstTwoCharacters);
        if(firstTwoNumber <=26)
        {
            char character = (char)('a'+ firstTwoNumber-1);
            printAllDecoding(number.substring(2),output+character);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        printAllDecoding(s,"");
    }
}

