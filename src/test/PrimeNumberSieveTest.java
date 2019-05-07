package test;

import main.PrimeNumberSieve;
import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberSieveTest {
    @Test
    public void testGetPrimeNumbersRange1() {
        PrimeNumberSieve sieve = new PrimeNumberSieve(1);
        Assert.assertArrayEquals(sieve.getPrimeNumbers().toArray(), new Integer[]{});
    }

    @Test
    public void testGetPrimeNumbersRange20() {
        PrimeNumberSieve sieve = new PrimeNumberSieve(20);
        Assert.assertArrayEquals(sieve.getPrimeNumbers().toArray(), new Integer[]{2, 3, 5, 7, 11, 13, 17, 19});
    }
}
