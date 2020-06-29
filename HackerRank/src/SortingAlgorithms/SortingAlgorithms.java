package SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{1,5,54,211,21,3,9,23,2,122133123,34353,5687,798908,12121,2233,56567,1122,32334,6776545,12112,12,55,65,12,122,322,56,800,567,1212,20,87,46,99,23,789,987,21122,1212,5434,6565,786,8779,121,23234,8787,4554};
        int[] test1 = new int[]{3,5,2,7,9,19};
        //int[] bubbleSortResult = bubbleSort(array);
        //int[] insertionSortResult = insertionSort(array);
        int[] selectionSortResult = selectionSort(array);
        Arrays.stream(selectionSortResult).forEach(System.out::println);
    }

    public static int[] bubbleSort(int[] arr){
        boolean comparisonOccurred;
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            comparisonOccurred = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1]<arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    comparisonOccurred = true;
                }
            }
            if(!comparisonOccurred){
                break;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        //Starting from index 1 and thus dividing the array into sorted and unsorted array.
        for (int i = 1; i < arr.length; i++) { //O(n)

            int key = arr[i];
            int j = i-1;

            while(j>0 && arr[j]>key){ //O(n)
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
        return arr;
        //Worst case Time Complexity of Insertion Sort is O(n2) when the list is sorted in reverse order
    }

    //This sorting technique takes O(n2) worst case time complexity and no extra space
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int currMin = arr[i];
            int currMinIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<currMin){
                    currMin = arr[j];
                    currMinIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[currMinIndex];
            arr[currMinIndex] = temp;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        return arr;
    }

    public static int[] quickSort(int[] arr) {
        return arr;
    }
}
