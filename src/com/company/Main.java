package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) {
        // setting up arrays & expected arrays
        int[] large = largeBatch().clone();
        int[] small = smallBatch().clone();
        int[] expectedLrg = expected(large);
        int[] expectedSml = expected(small);

        // sorting time!!
        small = Sort.selectionSort(small);
        large = Sort.selectionSort(large);

        // printing
        System.out.println("-- Selection Sort --");
        System.out.println("Small: "+arrayToString(small));
        System.out.println("Expected small: "+arrayToString(expectedSml));
        System.out.println("Large: "+arrayToString(large));
        System.out.println("Expected large: "+arrayToString(expectedLrg));

        System.out.println("\n\n-- Linear Search --");
        System.out.println("Index for 5 in small array: "+Search.findIndex(small, 5));
        System.out.println("Index for 10 in small array: "+Search.findIndex(small, 10));

        large = largeBatch().clone();
        small = smallBatch().clone();
        expectedLrg = expected(large);
        expectedSml = expected(small);

        small = Sort.bubbleSort(small);
        large = Sort.bubbleSort(large);

        System.out.println("\n\n-- Bubble Sort --");
        System.out.println("Small: "+arrayToString(small));
        System.out.println("Expected small: "+arrayToString(expectedSml));
        System.out.println("Large: "+arrayToString(large));
        System.out.println("Expected large: "+arrayToString(expectedLrg));

        large = largeBatch().clone();
        small = smallBatch().clone();
        expectedLrg = expected(large);
        expectedSml = expected(small);

        small = Sort.insertionSort(small);
        large = Sort.insertionSort(large);

        System.out.println("\n\n-- Insertion Sort --");
        System.out.println("Small: "+arrayToString(small));
        System.out.println("Expected small: "+arrayToString(expectedSml));
        System.out.println("Large: "+arrayToString(large));
        System.out.println("Expected large: "+arrayToString(expectedLrg));

        System.out.println("\n\n-- Binary Search --");
        System.out.println("Index for 10 in large array: "+Search.binarySearch(large, 10));
        System.out.println("Index for 50 in large array: "+Search.binarySearch(large, 50));
        System.out.println("Index for 500 in large array: "+Search.binarySearch(large, 500));
        System.out.println("Index for 5000 in large array: "+Search.binarySearch(large, 5000));
        System.out.println("Index for 9876 in large array: "+Search.binarySearch(large, 9876));
    }

    public static int[] largeBatch() {
        int output[] = new int[2000];
        for (int i = 0; i < 2000; i++) {

            output[i] = (r.nextInt(10000));
        }
        return output;
    }

    public static int[] smallBatch() {
        int output[] = new int[20];
        for (int i = 0; i < 20; i++) {

            output[i] = (r.nextInt(100));
        }
        return output;
    }

    public static int[] expected(int[] unsorted) {
        int[] sorted = unsorted.clone();
        Arrays.sort(sorted);
        return sorted;
    }

    public static String arrayToString(int[] arr) {
        String output = "";
        for (int value : arr) {
            output = output+value+", ";
        }
        output = output.substring(0,output.length()-2);
        return output;
    }
}
