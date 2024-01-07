package com.amigoscode;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> bills = new ArrayList<>(Arrays.asList(162,106,65,121,60,182,96,92));
        int total = 0;

        for (int value : bills) {
            total += value;
        }

        System.out.println(total/bills.size());
    }
}