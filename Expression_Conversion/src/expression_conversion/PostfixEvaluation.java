
import java.util.Stack;

public class PostfixEvaluation<T>
{

    public static void main(String[] args)
    {
        Stack<Double> stack = new Stack<>();
        String exp = "**1^235";

        for (int i = exp.length()-1; i >=0; i--)
        {
            char currentChar = exp.charAt(i);
            if (Character.isDigit(currentChar))
            {
                double num = Double.parseDouble(" " + currentChar);
                stack.push(num);
            } else
            {
                double op1 = stack.pop();
                double op2 = stack.pop();
                switch (currentChar)
                {
                    case '^':
                    stack.push(Math.pow(op1 ,op2));
                    break;
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        return;
                }
            }
        }

        if (!stack.isEmpty())
        {
            double result = stack.pop();
            System.out.println("Result: " + result);
        } else
        {
            System.out.println("Invalid postfix expression");
        }
    }
}

//import java.util.Stack;
//
//public class PostfixEvaluation {
//
//    public static void main(String[] args) {
//        System.out.println(prefixEl("+*+*23121"));
//    }
//
//    public static double prefixEl(String exp) {
//        Stack<Double> st = new Stack<>();
//        for (int i = exp.length()-1; i >= 0; i--) {
//            char c = exp.charAt(i);
//            if (Character.isDigit(c) ){
//                double d = Double.parseDouble("" +(c));
//                st.push(d);
//            } else {
//                if (exp.charAt(i) == '+') {
//                    double d1 = st.pop();
//                    double d2 = st.pop();
//                    st.push(d1 + d2);
//                } else if (exp.charAt(i) == '-') {
//                     double d1 = st.pop();
//                    double d2 = st.pop();
//                   
//                    st.push(d1 - d2);
//                } else if (exp.charAt(i) == '/') {
//                    double d1 = st.pop();
//                    double d2 = st.pop();
//                    st.push(d1 / d2);
//                } else if (exp.charAt(i) == '*') {
//                    double d1 = st.pop();
//                    double d2 = st.pop();
//                    st.push(d1 * d2);
//                }
//            }
//        }
//
//        return st.pop();
//    }
//    
//}

















