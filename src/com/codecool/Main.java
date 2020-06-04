package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> getPrimes = getPrimes(200);
        for (int i = 0; i < getPrimes.size(); i++) {
            System.out.print(getPrimes.get(i) + " ");
        }
        System.out.println();
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        sieveOfEratosthenes.sieveOfEratosthenes(200);
    }

    static List<Integer> getPrimes(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int k = 2; k <= n; k++) {
            int counter = 0;
            for (int i = 1; i <= k; i++) {
                if ((k % i) == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers.add(k);
            }
        }
        return primeNumbers;
    }
}
