/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maseo Junior
 */
public class Question2 {
   
    
    public static void main(String[] args) {
        int limit = 5; // Example limit
        int result = 0;
        for (int i = 1; i <= limit; i++) {
            result += squareSum(i);
        }
        System.out.println("Sum of squares of odd numbers up to " + limit + ": " + result);
    }

    static int squareSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1) * (2 * i - 1);
        }
        return sum;
    }
}

