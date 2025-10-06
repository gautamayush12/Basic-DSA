package NumberMaths;

public class decimalToBinary{
    public static int decimalToBinaryConv(int n){
        String str = "";
        while(n>0){
            int rem = n%2;
            str += rem;
            n=n/2;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversed);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}