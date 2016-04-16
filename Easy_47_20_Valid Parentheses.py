class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack=[]
        for c in s:
            if c in ['(','[','{']:
                stack.append(c)
            else:
                if(len(stack)==0):
                    return False
                top=stack[len(stack)-1]
                if ((c == ')' and top=='(') or (c == ']' and top=='[') or (c == '}' and top == '{')):
                    stack.pop()
                else:
                    return False

        return len(stack)==0
