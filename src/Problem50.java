import java.util.ArrayList;
import java.util.PriorityQueue;

public class Problem50 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 1; i < 1000000; i++) {
            if (Prime.isPrime(i)) {
                primes.add(i);
            }
        }
        //System.out.println(primes.size());

        ArrayList<Long> contiguousSum = new ArrayList<>();
        contiguousSum.add((long)2);
        for(int i = 1; i < primes.size(); i++) {
            contiguousSum.add(contiguousSum.get(i-1) + primes.get(i));
        }
        /*
        for(int i = 0; i < 10; i++) {
            System.out.println(primes.get(i) + ": " + contiguousSum.get(i));
        }
        */
        for(int numPrimes = primes.size() - 1; numPrimes > 1; numPrimes--) {
            for(int j = primes.size() - 1; j >= numPrimes; j--) {
                long diff = contiguousSum.get(j) - contiguousSum.get(j - numPrimes);
                if(diff < 1000000 && Prime.isPrime(diff)) {
                    //System.out.println(contiguousSum.get(j));
                    //System.out.println(contiguousSum.get(j - numPrimes));
                    //System.out.println(Prime.isPrime(diff));
                    //System.out.println(diff);
                    if(diff < 1000000) {
                        System.out.println("ANSWER: \n" + diff);
                        return;
                    }
                }
            }
            //System.out.println(numPrimes);
        }

    }
}
