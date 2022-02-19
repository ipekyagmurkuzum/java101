public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, lastDigit, reverseNumber = 0;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }

        return reverseNumber == number;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(101));
    }
}
