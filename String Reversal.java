// How to reverse a given string

ublic class StringReversal {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String word = "Java";
        String reversedWord = reverse(word);
        System.out.println("Reversed word: " + reversedWord);
    }
}