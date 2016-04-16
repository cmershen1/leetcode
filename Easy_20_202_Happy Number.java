public class Solution {
    public boolean isHappy(int num) {
        while(true)  {
			if(num==1)
				return true;
			else if(num==4||num==16||num==37||num==58||num==89||num==145||num==42||num==20)
				return false;
			else {
				int newnum=0;
				while(num!=0) {
					newnum=newnum+(num%10)*(num%10);
					num=num/10;
				}
				num=newnum;	
			}		
		}
    }
}
