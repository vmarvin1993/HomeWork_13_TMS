package function_interface;

import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);

    static String strFunc(StringInterface sf, String s) {
        return sf.getFunc(s);
    }

    public static void main(String[] args) {
        System.out.println("Chose:");
        System.out.println("1 - Reverse string");
        System.out.println("2 - find factorial number");
        System.out.println("3 - exit");

        int in = input.nextInt();

        while (true) {
            if (in == 1) {
                /**
                 * Reverse input words
                 */
                System.out.println("Enter a few words:");
                String inString = inputString.nextLine();
                System.out.println("Original: " + inString);

                StringInterface reverse = (str) -> {
                    String result = "Reverse: ";
                    int i;
                    for (i = str.length() - 1; i >= 0; i--)
                        result += str.charAt(i);
                    return result;
                };

                System.out.println(strFunc(reverse, inString));
                return;
            } else if (in == 2) {
                /**
                 * Find factorial number
                 */
                System.out.println("Enter a number:");
                int inNumber = inputInt.nextInt();
                IntInterface factorial = (n) -> {
                    int result = 1;
                    for (int i = 1; i <= n; i++)
                        result = i * result;
                    return result;
                };

                System.out.println("Factorial number: " + factorial.getNum(inNumber));
                return;
            } else if (in == 0) {
                break;
            }
        }
    }
}
//    Original: Hello world
//        Reverse: dlrow olleH
//
//
//    Enter a number:
//        7
//        Factorial number: 5040