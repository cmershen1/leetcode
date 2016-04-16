public class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(len==0)
            return null;
        boolean all9=true;
        for(int i=0;i<len;i++) {
            if(digits[i]!=9) {
                all9=false;
                break;
            }
        }
        if(all9) { //this num has the form of 999......... , which will be 1000.... after added 1.
            int[] result=new int[len+1];
            result[0]=1;
            return result;
        }
        else {
            if(digits[len-1]<9)
                digits[len-1]++;
            else {
                digits[len-1]=0;
                int i=len-2;
                while(digits[i]==9)
                    digits[i--]=0;
                digits[i]++;
            }
            return digits;
        }
    }
}
