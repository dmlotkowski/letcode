class Solution {
    public boolean isPalindrome(int x) {

        int number = x;

        if (number < 0)
            return false;

        int rev = 0;

        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            rev = rev * 10 + temp;
        }

        if (rev == number)
            return true;
        return false;

    }
}
