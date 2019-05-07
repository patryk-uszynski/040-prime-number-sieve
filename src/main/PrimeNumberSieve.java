package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberSieve {
    private boolean[] isPrimeArray;
    private int size;
    private int max;

    public PrimeNumberSieve(int size) {
        this.size = size;
        isPrimeArray = new boolean[size+1];
        Arrays.fill(isPrimeArray, true);
        max = (int) Math.round(Math.sqrt(size));
    }

    public List<Integer> getPrimeNumbers() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            if (isPrimeArray[i]) {
                for (int j = i * 2; j <= size; j+=i) {
                    isPrimeArray[j] = false;
                }
            }
        }

        for (int i = 2; i < isPrimeArray.length; i++) {
            if (isPrimeArray[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
