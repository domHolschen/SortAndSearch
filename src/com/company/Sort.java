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
            for (int j=smallestIndex; j>i; j--) { // shifts everything
                output[j] = output[j-1];
            }
            output[i] = smallest;
        }
        return output;
    }

    public static int[] bubbleSort(int[] input) {
        int[] output = input.clone();
        boolean isFinished;
        do {
            isFinished = true;
            for (int i=0;i< output.length-1;i++) {
                if (output[i]>output[i+1]) {
                    int middleman = output[i];
                    output[i] = output[i+1];
                    output[i+1] = middleman;
                    isFinished = false;
                }
            }
        } while (!isFinished);
        return output;
    }

    public static int[] insertionSort(int[] input) {
        int[] output = input.clone();
        for (int i=1;i<output.length;i++) {
            if (output[i]<output[i-1]) { // checks if key is less than next element
                for (int j=i;j>0;j--) { // shifter, starts at key value and goes to the left
                    if (output[j]<output[j-1]) { // checks if current value in the shift is less than the previous number
                        int middle = output[j]; // swaps current value in the shift with the previous value
                        output[j] = output[j-1];
                        output[j-1] = middle;
                    } else {
                        break; // exits shifting part if current value being shifted is greater or equal to the previous number
                    }
                }
            }
        }
        return output;
    }
}
