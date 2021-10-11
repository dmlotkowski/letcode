public class PlusOne {
    public int[] plusOne() {
        int[] digits = {9,9,9,9};
        int len = digits.length;

        digits[digits.length-1] = digits[digits.length-1]+1;

        for (int i = 0; i < digits.length; i++) {
            if (digits[len-1] == 10 && len > 1) {
                digits[len-1] = 0;
                digits[len-2] = digits[len-2] + 1;
                len = len - 1;
            }
        }

        if (digits[0] == 10) {
            int[] copyDigits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = 1;
            copyDigits[0] = 1;
            copyDigits[copyDigits.length - 1] = 0;
            digits = copyDigits;
        }
        
        return digits;
    }
}
