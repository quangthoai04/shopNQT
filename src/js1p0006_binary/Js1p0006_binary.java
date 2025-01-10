/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js1p0006_binary;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Js1p0006_binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
 int size = 0;
        while (true) {
            try {
                System.out.println("Enter number of array:");

                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number.");
                }

            } catch (Exception e) {
                System.out.println("sai dinh dang so:" + e.getMessage());
                System.out.println("vui long nhap lai:");
            }

        }
        
        RandomIntefer a = new RandomIntefer();
        int[] array = a.generateRandomInteger(size);

        BinarySearch b = new BinarySearch();
        b.quickSort(array, 0, size-1);
        System.out.println(" mang sx:" + Arrays.toString(array));
        System.out.println("nhap so can tim:");
        int n = scanner.nextInt();

        int findIndex = b.Search(array, n, 0, size - 1);
        System.out.println("so can tim la: " + n + " tai vi tri " + findIndex);

    }

}
