class Solution {
    public int[] plusOne(int[] digits) {

        for(int i =digits.length-1;i>=0;i--){
              if(digits[i]==9){
                digits[i]=0;
              }
              else{
                digits[i]++;
                return digits;
              }
        }
        int carry[]=new int[digits.length+1];
        carry[0]=1;
        return carry;
    }
}
    














       

    
