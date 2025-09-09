import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // string ko words me split karo

        if (pattern.length() != words.length) {
            return false; // length mismatch
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                // Agar letter already mapped hai, word match hona chahiye
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // Agar word already kisi letter ke saath map ho chuka hai
                if (used.contains(word)) {
                    return false;
                }
                map.put(ch, word);
                used.add(word);
            }
        }

        return true;
    }
}
