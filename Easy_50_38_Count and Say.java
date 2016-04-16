public class Solution {
	 public  String countAndSay(int n) {
        if(n==1)
            return "1";
        else
        {
            String str=countAndSay(n-1);
            int i=0;
            String answer="";
            while(i<str.length())
            {
                int j=i;
                while(j<str.length() && str.charAt(i)==str.charAt(j))
                    j++;
                if(j>i)
                {
                    answer+=Integer.toString(j-i);
                    answer+=str.charAt(i);
                    i=j;
                }
                else
                    i++;
            }
            return answer;
        }
	 }
       
}
