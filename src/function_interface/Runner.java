package function_interface;

import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chose:");
        System.out.println("1 - Reverse string");
        System.out.println("2 - Find factorial number");
        System.out.println("0 - Exit");

        int in = input.nextInt();

        while (true) {

            if (in == 1) {
                /**
                 * Reverse input words
                 */
                System.out.println("Enter a few words:");
                String inString = inputString.nextLine();
                System.out.println("Original: " + inString);

                FunInterface<String> str = (s) -> {
                    StringBuilder sb = new StringBuilder();
                    String temp;
                    for (int i = s.length() - 1; i >= 0; i--) {
                        temp = String.valueOf(s.charAt(i));
                        sb.append(temp);
                    }
                    return sb.toString();

                };
                System.out.println("Reverse string: " + str.getFunc(inString));
                return;
            } else if (in == 2) {
                /**
                 * Find factorial number
                 */
                System.out.println("Enter a number:");
                int inNumber = inputInt.nextInt();
                FunInterface<Integer> factorial = (s) -> {
                    int result = 1;
                    for (int i = 1; i <= s; i++)
                        result = i * result;
                    return result;
                };
                System.out.println("Factorial number : " + factorial.getFunc(inNumber));
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