 /*
Problem_6: Jolly Jumper
Description: Check if sequence is Jolly or not
Approach: Track absolute differences using boolean array
Time Complexity: O(n)
*/

import java.util.*;

public class JollyJumper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] seen = new boolean[n]; 

        for(int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if(diff >= 1 && diff < n) {
                seen[diff] = true;
            }
        }

        boolean isJolly = true;

        for(int i = 1; i < n; i++) {
            if(!seen[i]) {
                isJolly = false;
                break;
            }
        }

        if(isJolly) {
            System.out.println("Jolly");
        } else {
            System.out.println("Not Jolly");
        }

        sc.close();
    }
} 
