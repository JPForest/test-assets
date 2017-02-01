package com.github.jpforest.ta.covered;

public class IntComparator {

    private int a = 0;

    public IntComparator(int a) {
        this.a = a;
    }

    public boolean isBiggerThan(int b) {
        return a > b;
    }

    public boolean isEqualsTo(int b) {
        return a == b;
    }

    public boolean isLessThan(int b) {
        return a < b;
    }

    public static int max(int a,
                          int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
