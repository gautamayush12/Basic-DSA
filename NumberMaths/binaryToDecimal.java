package NumberMaths;

public class binaryToDecimal{
        public static int binaryToDecimalConv(String B){
        // int n = Integer.parseInt(B);
        // int t = n;
        int resDec = 0;
        int base = 1;
        // while(n>0){
        //     int r = n%10;
        //     resDec = resDec + r * base;
        //     t = t/10;
        //     base = base*2;
        // } return resDec;
        for(int i=B.length()-1; i>=0 ;i--){
            if(B.charAt(i) == '1'){
                resDec = resDec + base;
            }
            base = base * 2;
        } return resDec;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}