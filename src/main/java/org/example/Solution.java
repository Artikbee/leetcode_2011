package org.example;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int res = 0;

        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) res++;
            if (operation.equals("X--") || operation.equals("--X")) res--;
        }

        return res;
    }
}
