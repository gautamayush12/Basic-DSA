package NumberMaths;

class armstrongNum {
    // Method to check if a number is Armstrong
    public static boolean armstrong(int n) {
        int temp = n;
        int sum = 0;
        int length = String.valueOf(n).length(); 

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, length);
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int num = 153; // example
        if (armstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}
