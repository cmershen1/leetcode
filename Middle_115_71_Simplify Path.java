public class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        List<String> list = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        for (String str : paths) {
        	if (str.equals(""))
        		continue;
        	else if (str.equals("..")) {
        		if(!stack.isEmpty())
        			stack.pop();
        		continue;
        	}
        	else if (str.equals("."))
        		continue;
        	else
        		stack.add(str);
        }
        String result = "";
        for(int i = 0;i<stack.size();i++) {
        	result=result+"/"+stack.get(i);
        }
        if(result=="")
        	result+="/";
        return result;
    }
}
