public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int len1=v1.length;
        int len2=v2.length;
        int i;
        for(i=0;i<Math.min(len1,len2);i++) {
            int temp1=Integer.parseInt(v1[i]);
            int temp2=Integer.parseInt(v2[i]);
            if(temp1!=temp2)
                return temp1<temp2?-1:(temp1>temp2?1:0);
        }
        if(len1>len2) {
            for(int j=i;j<len1;j++)
                if(Integer.parseInt(v1[j])!=0)
                    return 1;
            return 0;
        }
        else if(len1<len2) {
            for(int j=i;j<len2;j++)
                if(Integer.parseInt(v2[j])!=0)
                    return -1;
            return 0;
        }
        else
        	return 0;
    }
}
