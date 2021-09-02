import java.util.ArrayList;

public class Soultion {
    public int reverse() {

        int x = 1534236469;

        String helper = Integer.toString(x);
        char[] chars = helper.toCharArray();
        ArrayList<Character> reversedString = new ArrayList<>();

        for (int i = chars.length - 1; i >= 0; i--)  {
            char c = chars[i];

            if (c == '-') {
                reversedString.add(0, c);
                break;
            }
            reversedString.add(c);
        }

        String finalstring = "";

        for (Character s : reversedString) {
            finalstring += s;
        }
        
        if (x == 0) {
            x = 0;
        } else {
            try {
                x = Integer.parseInt(finalstring);
            } catch (Exception e) {
                return 0;
            }
        }
      
        return x;
    }
}
