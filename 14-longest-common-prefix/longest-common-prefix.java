class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Pehla string ko prefix maan lo
        String prefix = strs[0];

        // Baaki strings ke saath compare karo
        for (int i = 1; i < strs.length; i++) {
            // Jab tak current string prefix se start nahi hoti, prefix ko shorten karo
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
