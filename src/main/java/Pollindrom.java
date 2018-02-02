public class Pollindrom {

    public static boolean isPalindrome(String word) {

        return word.equals(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(Pollindrom.isPalindrome("Аба"));

    }
}

