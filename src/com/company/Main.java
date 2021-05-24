package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) {
        /*
         * Call your sorting and searching Algorithms here...
         *
         * */
        ArrayList<Integer> large = largeBatch();
        ArrayList<Integer> small = smallBatch();
        ArrayList<Integer> expectedLrg = expected(large);
        ArrayList<Integer> expectedSml = expected(small);


    }

    public static ArrayList<Integer> largeBatch() {
        ArrayList<Integer> largeBatch = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {

            largeBatch.add(r.nextInt(10000));
        }
        return largeBatch;
    }

    public static ArrayList<Integer> smallBatch() {
        ArrayList<Integer> smallBatch = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            smallBatch.add(r.nextInt(100));
        }
        return smallBatch;
    }

    public static ArrayList<Integer> expected(ArrayList<Integer> unsorted) {
        ArrayList<Integer> sorted = (ArrayList<Integer>) unsorted.clone();
        Collections.sort(sorted);
        return sorted;
    }
}
