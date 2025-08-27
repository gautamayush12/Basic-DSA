package String;
//leetcode 557
class reverseWordsStr3 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        // for(int i=0; i<chars.length; i++){
        //     System.out.println(chars[i]);
        // }
        int start = 0;
        for(int i=0; i<=chars.length; i++){
            if (i == chars.length || chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            }
        }
        return new String(chars);
    }
    private void reverse(char[] arr, int left, int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        reverseWordsStr3 obj = new reverseWordsStr3();
        String str = "  hello world  ";
        System.out.println(obj.reverseWords(str));
    }
}