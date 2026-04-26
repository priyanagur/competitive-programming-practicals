/*
Problem_5: LED Display
Description: Print number in LCD display format
Approach: Store patterns of digits and print row-wise
Time Complexity: O(n)
*/

import java.util.*;

public class LEDDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        String[][] digits = {
            {" _ ", "| |", "|_|"}, 
            {"   ", "  |", "  |"}, 
            {" _ ", " _|", "|_ "},
            {" _ ", " _|", " _|"}, 
            {"   ", "|_|", "  |"}, 
            {" _ ", "|_ ", " _|"}, 
            {" _ ", "|_ ", "|_|"}, 
            {" _ ", "  |", "  |"}, 
            {" _ ", "|_|", "|_|"}, 
            {" _ ", "|_|", " _|"}  
        };
        
        for(int row = 0; row < 3; row++) {
            for(int i = 0; i < num.length(); i++) {
                int digit = num.charAt(i) - '0';
                System.out.print(digits[digit][row] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
