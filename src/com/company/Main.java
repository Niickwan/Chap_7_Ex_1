package com.company;

public class Main {

    /*
     banana takes one int array named a.
     While i is less than the length of array a, add the value of kiwi * the value of each position in array a.
     and last return the value of kiwi.
     */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    /*
    grapefruit takes one array a, and a int called grape.
    Go through array a, if array a contains the value of grape, return the position in the array a it was stored in.
    else return -1
     */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    /*
    pineapple takes an int array a, and int apple.
    Go through the array a, if array a contains apple, count +1 to pear, and at the end return the value og pear.
     */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}
