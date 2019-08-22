package se.ecutb.cheng;

import java.util.Scanner;

public class Minicalculator {
    public static void main(String[] args) {
        //for operator selection
        Scanner scanner = new Scanner(System.in);
        String operatorInput;
        char operator;

        //numbers for calculation
        int number1;
        int number2;
        int answer;
        Scanner scanner1 = new Scanner(System.in);

        //for determine if continue or not
        Scanner scanner2 = new Scanner(System.in);
        String determine;
        char dtm;

        for (int i = 0; ; i++) {
            //determine if continue or not
            System.out.println("Do you want to continue? y/n");
            determine = scanner.nextLine();
            dtm = determine.charAt(0);
            if (dtm == 'n') {
                break;
            } else {
                //input +,-,* or /
                System.out.println("Please select a basic operation among +-*/.");
                operatorInput = scanner.nextLine();
                //String converts to char
                operator = operatorInput.charAt(0);

                //input two numbers
                System.out.println("Please enter the 1st number:");
                number1 = scanner1.nextInt();
                System.out.println("The 1st number you enter is: " + number1);
                System.out.println("Please enter the 2nd number:");
                number2 = scanner1.nextInt();
                System.out.println("The 2nd number you enter is: " + number2);

                switch (operator) {
                    case '+':
                        answer = addition(number1, number2);
                        System.out.println(number1 + " + " + number2 + " = " + answer);
                        break;
                    case '-':
                        answer = subtraction(number1, number2);
                        System.out.println(number1 + " - " + number2 + " = " + answer);
                        break;
                    case '*':
                        answer = multiplication(number1, number2);
                        System.out.println(number1 + " * " + number2 + " = " + answer);
                        break;
                    case '/':
                        answer = division(number1, number2);
                        System.out.println(number1 + " / " + number2 + " = " + answer);
                        break;
                    default:
                        System.out.println("Please enter a basic operator.");
                }
            }
        }
    }


    public static int addition(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int subtraction(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static int multiplication(int num1, int num2){
        int result = num1 * num2;
        return result;
    }

    public static int division(int num1, int num2){
        int result = num1/num2;
        return result;
    }

}
