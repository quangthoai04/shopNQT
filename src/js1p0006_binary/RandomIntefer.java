/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js1p0006_binary;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class RandomIntefer {
    public int[] generateRandomInteger(int size){
   

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size); // Tạo số ngẫu nhiên từ 0 đến 99
        }
return array;
}
}


