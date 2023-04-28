package workshop_day3;

import java.util.LinkedList;
import java.util.Queue;

public class PrimeNumbersQueue {
    public static void main(String[] args) {
        int rangeStart = 0;
        int rangeEnd = 1000;
        Queue<Integer> primeNumbersQueue = new LinkedList<Integer>();

        for (int i = rangeStart; i <= rangeEnd; i++) {
            boolean isPrime = true;

            // check if the number is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // add the prime number to the queue
            if (isPrime && i > 1) {
                primeNumbersQueue.add(i);
            }
        }
        // print the prime numbers in the queue
        System.out.println("Prime numbers within the range " + rangeStart + " to " + rangeEnd );
        while (!primeNumbersQueue.isEmpty()) {
            System.out.println(primeNumbersQueue.poll());
        }
    }
}

