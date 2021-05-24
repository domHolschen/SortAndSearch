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
        System.out.println("Small: "+arrayToString(small));
        System.out.println("Expected small: "+arrayToString(expectedSml));
        System.out.println("Large: "+arrayToString(large));
        System.out.println("Expected large: "+arrayToString(expectedLrg));

        System.out.println("\nIndex for 5 in small array: "+Search.findIndex(small, 5));
        System.out.println("Index for 10 in small array: "+Search.findIndex(small, 10));
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
