public class Solution {
    public String convert(String s, int numRows) 
    {
        if(numRows==1)
			return s;
		else	{
			String answer="";
			int step1=(numRows-1)*2;
			int step2=0;
			
			for(int i=0;i<numRows;i++)	{
				String line="";
				int j=i;
				boolean isStep1=true;
				while(j<s.length())	{
					if(step2==0)	{
						line+=s.charAt(j);
						j+=step1;
					}
					else if(step1==0) {
						line+=s.charAt(j);
						j+=step2;
					}
					else	{
						line+=s.charAt(j);
						if(isStep1)
							j+=step1;
						else
							j+=step2;
						isStep1=!isStep1;
					}
				}
				answer=answer+line;
				step1-=2;
				step2+=2;
			}
			return answer;
		}
    }
}
