/*
Problem: 3n + 1 (Collatz Problem)
Description: For a given number n, apply rules:
             if even -> n/2
             if odd  -> 3n+1
             Repeat until n becomes 1.
Approach: Use loop and check even/odd condition.
Time Complexity: O(k) where k = number of steps
*/


import java.util.Scanner;
public class ThreeNPlusOne 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();

    int steps=0;
    while(num!=1)
    {
        if(num%2==0)
        {
            num=num/2;
        }
        else 
        {
            num=3*num+1;
        }
        steps++;
        System.out.println(num);
        System.out.println("\n Steps taken: "+steps);
    }
    }
}