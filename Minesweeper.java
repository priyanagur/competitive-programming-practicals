/*
Problem: Minesweeper
Description: Given a grid with mines (*), calculate number of adjacent mines for each empty cell.
Approach: Traverse grid and check all 8 directions for each cell.
Time Complexity: O(n * m)
*/

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        sc.nextLine(); // IMPORTANT

        System.out.println("Enter each row without spaces (e.g., *...):");

        for(int i = 0; i < n; i++) {
            String row = sc.nextLine();

            for(int j = 0; j < m; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        int[][] result = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(grid[i][j] == '*') {
                    result[i][j] = -1;
                } else {
                    int count = 0;

                    for(int x = -1; x <= 1; x++) {
                        for(int y = -1; y <= 1; y++) {
                            int ni = i + x;
                            int nj = j + y;

                            if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                                if(grid[ni][nj] == '*') {
                                    count++;
                                }
                            }
                        }
                    }

                    result[i][j] = count;
                }
            }
        }

        System.out.println("Minesweeper Grid:");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(result[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(result[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}