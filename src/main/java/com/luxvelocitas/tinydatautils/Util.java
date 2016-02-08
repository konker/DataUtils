package com.luxvelocitas.tinydatautils;

import java.util.Random;

public class Util {
    private static Random sRandom;

    private Util() { }

    // Fisher–Yates shuffle
    public static void shuffleIntArrayInPlace(int[] array) {
        if (sRandom == null) {
            sRandom = new Random();
        }

        int count = array.length;
        int j, temp;
        for (int i = count; i>1; i--) {
            j = sRandom.nextInt(i);

            // Swap arrray[i-1] and array[j]
            temp = array[i-1];
            array[i-1] = array[j];
            array[j] = temp;
        }
    }

    public static void shuffleIntSubArrayInPlace(int[] array, int offset) {
        if (array.length <= offset) {
            return;
        }

        // Create a temporary sub array
        int subArrayCount = array.length - offset;
        int[] subArray = new int[subArrayCount];

        // Copy over items after offset into the sub array
        System.arraycopy(array, offset, subArray, 0, subArrayCount);

        // Shuffle the sub arrray
        shuffleIntArrayInPlace(subArray);

        // Copy the shuffled sub array back to the original array after offset
        System.arraycopy(subArray, 0, array, offset, subArrayCount);
    }
}
