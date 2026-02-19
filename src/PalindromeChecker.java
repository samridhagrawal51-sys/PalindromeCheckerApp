public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "madam";
        System.out.println(isPalindrome(test));
    }
}

