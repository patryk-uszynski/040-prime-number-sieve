package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Get all prime numbers to limit of: ");
        Scanner scanner = new Scanner(System.in);
        PrimeNumberSieve sieve = new PrimeNumberSieve(scanner.nextInt());
        System.out.print("Output size: ");
        System.out.println(sieve.getPrimeNumbers().size());
    }
}
