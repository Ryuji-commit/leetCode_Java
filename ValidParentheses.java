import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<String> stack = new Stack<>();
        for (String elm : s.split("")) {
            if (elm.equals("(") || elm.equals("{") || elm.equals("[")) {
                stack.push(elm);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (!isPare(stack.pop(), elm)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isPare(String poped, String elm) {
        if (poped.equals("(") && !elm.equals(")")) {
            return false;
        }

        if (poped.equals("[") && !elm.equals("]")) {
            return false;
        }

        if (poped.equals("{") && !elm.equals("}")) {
            return false;
        }

        return true;
    }
}