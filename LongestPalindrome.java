public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "vevfg";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String str){
        int start = 0;
        int end = 0;
        int len = 0;
        for(int i=0;i<str.length();i++){
            len = longestPalindrome(str,i,i);
            if(len>end-start){
                start = i - ((len-1)/2);
                end = i + (len/2);
            }
        }
        return "Longest Palindromic sequence is : "+str.substring(start,end+1)+" whose length is "+(end-start);
    }

    public static int longestPalindrome(String str,int left,int right){
        if(str==null || left>right){
            return 0;
        }
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
    return right-left-1;
    }
}
