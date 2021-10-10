class Solution {
    public int lengthOfLastWord(String s) {
        int maxLength = 0;
        int len = s.length();
        boolean lastSpaceRemoved = false;

        for (int i = 0; i < len; i++) {

            while (!lastSpaceRemoved) {
                if (s.charAt(len-1) == ' ') {
                    len = len - 1;
                } else lastSpaceRemoved = true;
            }

            if (s.charAt(i) == ' ') {
                maxLength = 0;
                continue;
            } else {
                maxLength += 1;
            }
        }
        return maxLength;
    }
}
