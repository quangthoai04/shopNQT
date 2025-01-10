/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js1p0006_binary;

/**
 *
 * @author ADMIN
 */
public class BinarySearch {

    public int Search(int[] array, int value, int left, int right) {
        int mid = (left+right)/2; 
 if(left>right){
     return -1;
 }else{
     if(array[mid]== value){
         return mid;
     }else if (array[mid]>value){
         return Search(array, value, left, mid-1);
     }else return Search(array, value, mid+1, right);
 }
     
    }
 
    
    
//    public void bubbleSort(int[] arr) {
//        int n= arr.length;
//        int temp = 0;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                  arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                
//            }
//            
//        }
//       
//        }
//    }
    
    public void quickSort(int[] arr, int i, int j){
        if(i<j){
            int pivot = partition(arr, i, j);
            quickSort(arr, i, pivot-1);
            quickSort(arr, pivot+1 , j);
        }
    }
    
    
    public int partition(int[] arr, int i, int j){
       int pivot = arr[i];
       int mid = i;
        
        for (int k = i+1; k <= j; k++) {
            if(arr[k]< pivot){
                mid++;
                swap(arr, k, mid);
            }
        }
          swap(arr, mid, i);
        return mid;
    }
    
    public void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
}
}
