class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLength = strs[0].length();

        for (int i=1; i<strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i=0; i < minLength; i++) {

            char ch=strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (strs[j].charAt(i) != ch) {
                    return result.toString();
                }
            }

            result.append(ch);
        }

        return result.toString();
    }
}