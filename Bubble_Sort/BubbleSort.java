package Bubble_Sort;
import java.util.Arrays;
 
/**
* Java program to implement bubble sort algorithm and sort integer array using
* that method.
*/
public class BubbleSort{
 
   public static void main(String args[]) {
        bubbleSort(new int[] { 56,75,98,23,65,22,12,11 });
        bubbleSort(new int[] { -3, 5, 4,0 });
        bubbleSort(new int[] { 13, 3, -3, 21,0 });

    }
 /* This method sort the integer array using bubble sort algorithm */
    public static void bubbleSort(int[] numbers) {
        System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length -1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j-1);
                }
            }
        }
        System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",
                Arrays.toString(numbers));
    }
    
    /*
     * Utility method to swap two numbers in array
     */
    public static void swap(int[] array, int from, int to){
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
 
}
