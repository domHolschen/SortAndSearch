package com.company;

public class Sort {
    public static int[] selectionSort(int[] input) {
        int output[] = input.clone();
        int smallest, smallestIndex;
        for (int i=0;i<output.length;i++) {
            smallest = output[output.length-1];
            smallestIndex = output.length-1;
            for (int j=i;j<output.length;j++) {
                if (smallest > output[j]) {
                    smallest = output[j];
                    smallestIndex = j;
                }
            }
            for (int j=smallestIndex; j>i; j--) {
                output[j] = output[j-1];
            }
            output[i] = smallest;
        }
        return output;
    }
}
