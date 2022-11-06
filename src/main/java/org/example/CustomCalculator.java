package org.example;

public class CustomCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public boolean dividedBy2(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int entrypoint(int x) {
        return this.priFunc(x);
    }

    private int priFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}
