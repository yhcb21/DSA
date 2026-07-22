class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        return simpleSieve(n);
    }

    public static int simpleSieve(int limit) {
        boolean[] prime = new boolean[limit];

        for (int i = 2; i < limit; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (prime[p]) {
                
                for (int i = p * p; i < limit; i += p) {

                    prime[i] = false;
                }
            }
        }

        int count = 0;

        for (int p = 2; p < limit; p++) {
            if (prime[p]) {

                count++;
            }
        }

        return count;
    }

}