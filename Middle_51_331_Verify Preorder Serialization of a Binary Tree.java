方法一：
public class Solution {
    public boolean isValidSerialization(String preorder) {
    	String[] nodes = preorder.split(",");
    	Stack<String> stack = new Stack<String>();
        for(String str : nodes) {
    		stack.push(str);
    		int size = stack.size();
    		while(size > 2 && stack.get(size-1).equals("#") && stack.get(size-2).equals("#") && !stack.get(size-3).equals("#")) {
    			stack.pop();
    			stack.pop();
    			stack.pop();
    			stack.push("#");
    			size = stack.size();
    		}  	
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}
方法二：
public class Solution {
    public boolean isValidSerialization(String preorder) {
        int len = preorder.length();
        int count = 0;
        for(int i=len-1; i>=0; i--){
            char tmp = preorder.charAt(i);
            if(tmp == ','){
                continue;
            }else if(tmp == '#'){
                count++;
            }else if(tmp != ',' && tmp != '#' && i!=0 && preorder.charAt(i-1)!=','){
                continue;
            }else{
                if(count<2){
                    return false;
                }else{
                    count--;
                }
            }
        }
        return count==1;
    }
}
