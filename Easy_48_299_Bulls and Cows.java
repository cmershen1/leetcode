public class Solution {
    public String getHint(String secret, String guess) {
        int slen=secret.length();
        boolean[][] scount=new boolean[10][slen];
        boolean[][] gcount=new boolean[10][slen];
        int[] s=new int[10];
        int[] g=new int[10];
        int a = 0,b = 0;
        for(int i=0;i<slen;i++) {
        	scount[secret.charAt(i)-'0'][i]=true;
        	s[secret.charAt(i)-'0']++;
        	gcount[guess.charAt(i)-'0'][i]=true;
        	g[guess.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++) {
        	int binc=Math.min(s[i], g[i]);	
        	if(binc==0)
        		continue;
        	b+=binc;
        	for(int j=0;j<slen;j++) {
        		if(scount[i][j] && gcount[i][j]) {
        			b--;
        			a++;
        		}
        	}
        }
        return new String(a+"A"+b+"B");
    }
}
