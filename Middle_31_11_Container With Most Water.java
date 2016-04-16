public class Solution {
    public int maxArea(int[] height) {
        int i=0;
		int j=height.length-1;
		int max=0;
		while(i<j) {
			int area=Math.min(height[i],height[j])*(j-i);
			if(area>max)
				max=area;
			if(height[i]<height[j]) 
				i++;
			else
				j--;
		}
		return max;
    }
}
