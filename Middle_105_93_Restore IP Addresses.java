public class Solution {
    public List<String> restoreIpAddresses(String s) {
         List<String> ipList = new ArrayList<String>();
         backtrack(ipList,"", 0, s);
         return ipList;
    }
    private void backtrack(List<String> ipList, String currentIP, int dots, String rest) {
    	if(dots==3 && isAvailableIP(rest)) {
    		currentIP+=rest;
    		ipList.add(currentIP);
    		return;
    	}
    	else if(rest.length() <= (4-dots)*3) {
    		for(int i =1;i<=Math.min(rest.length()-1, 3);i++) {
    			String temp = rest.substring(0,i);
    			if(isAvailableIP(temp)) {
    				backtrack(ipList,currentIP+temp+".", dots+1, rest.substring(i));
    			}
    		}
    	}
	}
	private boolean isAvailableIP(String num) {
		if(num.startsWith("0")) {
			return num.equals("0"); // 02,00... aren't available.
		}
		else {
			return Integer.parseInt(num)<256;
		}
	}
}
