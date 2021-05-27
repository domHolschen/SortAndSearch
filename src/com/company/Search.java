package com.company;

import java.util.Arrays;

public class Search {
    public static int findIndex(int[] input, int valueToFind) {
        int index = 0;
        for (int currentValue : input) {
            if (currentValue == valueToFind) return index;
            index++;
        }
        return -1;
    }

    public static int binarySearch(int[] input, int valueToFind) {
        int[] arr = input.clone();
        int mid, index=0, lowerBound = 0, upperBound = arr.length;
        while (true) {
            mid = (upperBound-lowerBound-1)/2 + 1 + lowerBound;
            if (arr[mid]<valueToFind) {
                lowerBound = mid;
            }
            if (arr[mid]>valueToFind) {
                upperBound = mid;
            }
            if (arr[mid]==valueToFind) {
                return mid;
            }
            if (upperBound-lowerBound == 1) return -1;
        }
    }
}
