class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs, Comparator.comparing(String::length));

        if (strs.length == 1) {
            return strs[0];
        }

        if (strs.length > 201 || strs[0].replaceAll("\\s+", "").equals("")) {
            return "";
        }

        String prefix = strs[0].substring(0, 1);
        int pos = 1;

        while (true) {
            for (int i = 0; i < strs.length; i++) {

                String s = strs[i].substring(0, pos);

                if (prefix.equals(s)) {
                    if (i == strs.length - 1) {
                        pos = pos + 1;
                        if (strs[i].length() >= pos && strs[0].length() >= pos) {
                            prefix = strs[1].substring(0, pos);
                            s = strs[i].substring(0, pos);
                        } else {
                            return strs[0].substring(0, pos - 1);
                        }
                    }
                } else {
                    return prefix.substring(0, prefix.length() - 1);
                }
            }
        }
    }
}
