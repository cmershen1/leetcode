O(n2)�ⷨ��
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=1)
			return nums.length;
		int[] dp=new int[nums.length];
		dp[0]=1;
		int maxLIS=1;
		for(int i=1;i<nums.length;i++) {
			int maxj=0;
			for(int j=0;j<i;j++) {
				if(dp[j]>maxj && nums[j]<nums[i])
					maxj=dp[j];
			}
			dp[i]=maxj+1;
			if(dp[i]>maxLIS)
			    maxLIS=dp[i];		
}
		return maxLIS;
    }
}
O(nlogn)�ⷨ��
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        int[] B = new int[n+1];//����B��
        B[0]=-10000;//��B[0]��Ϊ��С�������κ����붼����-10000��
        B[1]=nums[0];//��ʼʱ�������������г���Ϊ1����ĩԪ��Ϊa1
        int Len = 1;//LenΪ��ǰ�����������г��ȣ���ʼ��Ϊ1��
        int p,r,m;//p,r,m�ֱ�Ϊ���ֲ��ҵ��Ͻ磬�½���е㣻
        for(int i = 1;i<n;i++) {
            p=0;r=Len;
            while(p<=r)//���ֲ�����ĩԪ��С��ai+1�ĳ������������������У�
            {
               m = (p+r)/2;
               if(B[m]<nums[i]) p = m+1;
               else r = m-1;
            }
            B[p] = nums[i];//������Ϊp�������������еĵ�ǰ��ĩԪ����Ϊai+1;
            if(p>Len) Len++;//���µ�ǰ�����������г��ȣ�
           
           
        }
        return Len;
    }
}
