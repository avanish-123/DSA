public class CheckPalindromeString {
    static boolean palindromeCheck(String st, int start){
        if(st.charAt(start)!= st.charAt(st.length()-1-start)){
            return false;
        }
        if(start>st.length()/2){
            return true;
        }
        return palindromeCheck(st, start+1);
    }
    public static void main(String[] args) {
        String st = "madam";
        System.out.println(palindromeCheck(st, 0));
    }
}
