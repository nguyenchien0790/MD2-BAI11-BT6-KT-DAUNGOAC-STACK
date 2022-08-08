import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        boolean answer = isBalanced(expression);
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char bracket :
                expression.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);

            }
            if (bracket == ')') {
                if (stack.isEmpty()) {
                    stack.push(bracket);
                }
                if (stack.lastElement() == '(') {
                    stack.pop();
                }

            }
            if (bracket == '}') {
                if (stack.isEmpty()) {
                    stack.push(bracket);
                }
                if (stack.lastElement() == '{') {
                    stack.pop();
                }

            }
            if (bracket == ']') {
                if (stack.isEmpty()) {
                    stack.push(bracket);
                }
                if (stack.lastElement() == '[') {
                    stack.pop();
                }

            }

        }return stack.isEmpty();
    }

}