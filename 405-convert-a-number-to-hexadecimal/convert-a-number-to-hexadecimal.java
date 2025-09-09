class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // process 32 bits (8 hex digits max)
        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 15; // get last 4 bits
            sb.append(map[hexDigit]);
            num >>>= 4; // unsigned right shift
        }
        
        return sb.reverse().toString();
    }
}
