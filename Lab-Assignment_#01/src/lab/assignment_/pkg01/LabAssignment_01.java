
import java.util.Stack;

public class LabAssignment_01 {

    public static int precedence(char op) {
        switch (op) {
            case '^':
                return 4;
            case '*':
            case '/':
            case '%':
                return 3;
            case '+':
            case '-':
                return 2;
            default:
                return -1;
        }
    }
    
//public static double postEva(String ex) {
//    String[] pe = ex.split("\\s+"); // Corrected split pattern
//    Stack<Double> st = new Stack<>();
//    
//    for (int i = 0; i < pe.length; i++) {
//        if (Character.isDigit(pe[i].charAt(0))) {
//            // If the character is a digit, push its double value onto the stack
//            st.push(Double.parseDouble(pe[i]));
//        } else {
//            // If the character is an operator
//            double op2 = st.pop();
//            double op1 = st.pop();
//            switch (pe[i]) {
//                case "+":
//                    st.push(op1 + op2);
//                    break;
//                case "-":
//                    st.push(op1 - op2);
//                    break;
//                case "*":
//                    st.push(op1 * op2);
//                    break;
//                case "/":
//                    st.push(op1 / op2);
//                    break;
//                case "%":
//                    st.push(op1 % op2);
//                    break;
//                default:
//                    System.out.println("Invalid operator");
//                    break;
//            }
//        }
//    }
//    return st.pop();
//}
//    public static void main(String[] args)
//    {
//        String ex = "2 13 4 * + ";
//        System.out.println( postEva(ex));    }
//}

//public static double preEva(String pre) {
//    String[] pe = pre.split("\\s+");
//    
//    Stack<Double> st = new Stack<>();
//    
//    for (int i = pre.length()-1; i >= 0; i--) { 
//        
//        if (Character.isDigit(pe[i].charAt(0))) { // Access characters in tokens 'pe[i]'
//            // If the character is a digit, push its double value onto the stack
//            st.push(Double.parseDouble(pe[i]));
//        } else {
//            // If the character is an operator
//            double op2 = st.pop();
//            double op1 = st.pop();
//            switch (pe[i]) {
//                case "+":
//                    st.push(op1 + op2);
//                    break;
//                case "-":
//                    st.push(op1 - op2);
//                    break;
//                case "*":
//                    st.push(op1 * op2);
//                    break;
//                case "/":
//                    st.push(op1 / op2);
//                    break;
//                case "%":
//                    st.push(op1 % op2);
//                    break;
//                default:
//                    System.out.println("Invalid operator");
//                    break;
//            }
//        }
//    }
//    
//    return st.pop();
//}




    public static String in2pr(String exp) {
        Stack<Character> stack = new Stack<>();
        
        String ans = "";

        // Reverse the input expression
        String reversedExp = "";
        for (int i = exp.length() - 1; i >= 0; i--) {
            reversedExp += exp.charAt(i);
        }

        for (int i = 0; i < reversedExp.length(); i++) {
            char current = reversedExp.charAt(i);
            if (Character.isLetterOrDigit(current)) {
                ans += current;
            } else if (current == ')') {
                stack.push(current);
            } else if (current == '(') {
                while (!stack.isEmpty() && stack.peek() != ')' ) {
                    ans += stack.pop();
                }
                stack.pop(); // Pop ')' from the stack
            } else { // It's an operator
                while (!stack.isEmpty() && precedence(current) <= precedence(stack.peek())) {
                    ans += stack.pop();
                }
                stack.push(current);
            }
        }
        // Pop any remaining operators from the stack
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        // Reverse the result to get the prefix expression
        String prefixExpression = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            prefixExpression += ans.charAt(i);
        }

        return prefixExpression;
    }

    public static void main(String[] args) {
     
        String exp = "(2+(3*4))";
        String ex = "2 13 4 * + ";
        String pre = "+ * 2 13 2";
    }}
//        
//System.out.println("post evaluation is " + postEva(ex));
////        System.out.println("pre evaluation is" + preEva(pre));
//        System.out.println("Converted: " + in2pr(exp)); // Output should be "+2*34"
//    }
//}





//
//
//public static void main(String[] args) {
//        String exp = "(2+(3*4))";
//        System.out.println("Converted String is " + in2post(exp));
//    }
//
//    public static int precedence(char op) {
//        if (op == '^') {
//            return 4;
//        } else if (op == '*' || op == '/' || op == '%') {
//            return 3;
//        } else if (op == '+' || op == '-') {
//            return 2;
//        } else {
//            return -1; 
//        }
//    }
//
//    public static String in2post(String exp) {
//        String cEx = "";
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < exp.length(); i++) {
//            char c = exp.charAt(i);
//
//            if (Character.isDigit(c)) {
//                cEx += c;
//            } else if (c == '(') {
//                st.push(c);
//            } else if (c == ')') {
//                while (!st.isEmpty() && st.peek() != '(') {
//                    cEx += st.pop();
//                }
//                st.pop(); //
//            } else { 
//                while (!st.isEmpty() && precedence(st.peek()) >= precedence(c)) {
//                    cEx += st.pop();
//                }
//                st.push(c);
//            }
//        }
//
//        // Pop remaining operators from the stack
//        while (!st.isEmpty()) {
//            cEx += st.pop();
//        }
//        return cEx;
//    
