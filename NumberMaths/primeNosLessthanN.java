package NumberMaths;

public class primeNosLessthanN{
    // Brute force approach: check each number for primality
    public static int countPrimesBrute(int n) {
        int count = 0;
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int x){
        if(x < 2) return false;
        for(int i=2; i*i<=x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    // Sieve of Eratosthenes approach: much faster for large n
    public static int countPrimesSieve(int n) {
        if(n < 2) return 0;
        boolean[] isPrime = new boolean[n];
        for(int i=2; i<n; i++) isPrime[i] = true;
        for(int i=2; i*i<n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n; i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("Brute force count of primes less than " + n + ": " + countPrimesBrute(n));
        System.out.println("Sieve count of primes less than " + n + ": " + countPrimesSieve(n));
    }
}