class Solution {
    public boolean isPalindrome(int x) {
        
        String helper = Integer.toString(x);
        char[] chars = helper.toCharArray();
        ArrayList<Character> reversedString = new ArrayList<>();

        for (int i = chars.length - 1; i >= 0; i--)  {
            char c = chars[i];

            if (c == '-') {
                break;
            }
            reversedString.add(c);
        }
        
        String finalstring = "";

        for (Character s : reversedString) {
            finalstring += s;
        }
        
        try {
            int mirror = Integer.parseInt(finalstring);
            if (x == mirror) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }
}
