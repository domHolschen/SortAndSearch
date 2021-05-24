package com.company;

public class Search {
    public static int findIndex(int[] input, int valueToFind) {
        int index = 0;
        for (int currentValue : input) {
            if (currentValue == valueToFind) return index;
            index++;
        }
        return -1;
    }
}
