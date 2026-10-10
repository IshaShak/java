package recordprograms;

public class Roman {

    public int romanToInteger(String s) {
        int result = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value;

            switch (s.charAt(i)) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Invalid Roman numeral character: "
                        + s.charAt(i)
                    );
            }

            if (value < previous) {
                result -= value;
            } else {
                result += value;
            }

            previous = value;
        }

        return result;
    }
}
import java.util.Scanner;
import number.Roman;

public class RomanDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String input = sc.nextLine().trim().toUpperCase();

        try {
            Roman roman = new Roman();
            int result = roman.romanToInteger(input);

            System.out.println("Integer value: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}