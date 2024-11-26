//import java.util.Stack;
//
//public class Valid_Parentheses {
//
//
//    public boolean isValid(String s) {
//
//        Stack<Character> stack1 = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
//
//        StringBuilder ss= new StringBuilder(s);
//
//        for (int i = 0; i < ss.length(); i++) {
//            if(ss.charAt(i)=='(' || ss.charAt(i)=='{' || ss.charAt(i)=='['){
//                stack1.push(ss.charAt(i));
//            } else {
//                if (stack1.empty()) {
//                    return false;
//                }else if((stack1.peek()=='(' && ss.charAt(i)!= ')') || (stack1.peek()=='{' && ss.charAt(i)!= '}') || (stack1.peek()=='[' && ss.charAt(i)!= ']'))
//                            return false;
//                stack1.pop();
//
//
//
//                }
//
//            }
//        if (stack1.empty())
//        return true;
//
//        return false;
//
//        }
//
//
//
//    }
//
//}
