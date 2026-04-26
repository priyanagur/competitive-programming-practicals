/*
Problem_4: The Trip Problem
Description: Find minimum money exchange so all students spend equally
Approach: Calculate average and sum differences
Time Complexity: O(n)
*/

import java.util.*;

public class TripProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] expenses = new double[n];
        double sum = 0;

        System.out.println("Enter expenses:");
        for(int i = 0; i < n; i++) {
            expenses[i] = sc.nextDouble();
            sum += expenses[i];
        }

        double avg = sum / n;

        double give = 0;
        double take = 0;

        for(int i = 0; i < n; i++) {
            if(expenses[i] > avg) {
                give += Math.floor((expenses[i] - avg) * 100) / 100;
            } else {
                take += Math.floor((avg - expenses[i]) * 100) / 100;
            }
        }

        double result = Math.min(give, take);

        System.out.printf("Minimum exchange: %.2f\n", result);

        sc.close();
    }
}