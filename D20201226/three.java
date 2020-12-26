package D20201226;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 括号匹配问题
 * */
public class three {
    public static boolean method (String str) {
        if( str.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(map.containsKey(x)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if(!stack.pop().equals(map.get(x))) {
                    return false;
                }
            } else {
                stack.push(x);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean x = method("{}");
        System.out.println(x);
    }
}
