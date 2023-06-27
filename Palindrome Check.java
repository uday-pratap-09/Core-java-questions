// How to print Palindrome Check

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        String word = "madam";
        boolean palindrome = isPalindrome(word);
        System.out.println(word + " is a palindrome: " + palindrome);
    }
}