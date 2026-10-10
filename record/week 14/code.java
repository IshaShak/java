package recordprograms;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets onto the stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets.
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string containing brackets: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }

        sc.close();
    }
}