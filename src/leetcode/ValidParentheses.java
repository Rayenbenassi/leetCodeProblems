package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for( char c : s.toCharArray()) {
    		if(c=='('|| c=='{'||c=='[') {
    			stack.push(c);
    		}
    		else if(c==')'|| c=='}'||c==']') {
    			 if (stack.isEmpty()) {
                     return false;
    		}
    			 char top = stack.pop();
    			 if (!isMatchingPair(top, c)) {
                     return false;
                 }
    		
    	}
    	
    	}
    	return stack.isEmpty();
    	
    } 
        private static boolean isMatchingPair(char open, char close) {
            return (open == '(' && close == ')') ||
                   (open == '{' && close == '}') ||
                   (open == '[' && close == ']');
        }


    

	public static void main(String[] args) {
		isValid("([)]");

	}

}
