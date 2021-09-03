class Solution {
    public int romanToInt(String s) {
        
        int solutionHelper = 0;

        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("I", 1);
        alphabet.put("V", 5);
        alphabet.put("X", 10);
        alphabet.put("L", 50);
        alphabet.put("C", 100);
        alphabet.put("D", 500);
        alphabet.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            
            try {
                Character helper = s.charAt(i);
                Character helper2 = s.charAt(i+1);

                String s1 = String.valueOf(helper);
                String s2 = String.valueOf(helper2);

                boolean one = s1.equals("I") && (s2.equals("V") || s2.equals("X"));
                boolean two = s1.equals("X") && (s2.equals("L") || s2.equals("C"));
                boolean three = s1.equals("C") && (s2.equals("D") || s2.equals("M"));
                
                if (one || two || three) {
                    solutionHelper = solutionHelper + (alphabet.get(helper2.toString()) - alphabet.get(helper.toString()));
                    i = i+1;
                } else {
                    solutionHelper = solutionHelper + alphabet.get(helper.toString());
                }
                
            } catch (Exception e) {
                Character helper3 = s.charAt(i);
                solutionHelper = solutionHelper + alphabet.get(helper3.toString());
                break;
            }
        }
        
        return solutionHelper;
        
    }
}
