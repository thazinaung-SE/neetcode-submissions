class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        Arrays.sort(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);

        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(charS[i] != charT[i]) {
                return false;
            }
        }

        return true;
    }
}
