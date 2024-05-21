/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maseo Junior
 */
public class Question3 {
    
    
     public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("The GCD of " + a + " and " + b + " is: " + greatestCommonDivisor(a, b));
    }
}
