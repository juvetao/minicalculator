package se.ecutb.cheng;

import java.util.Scanner;

public class Minicalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepAlive = true;

        while(keepAlive) {
            //determine if continue or not
            System.out.println("Do you want to calculate? y/n");
            String determine = scanner.nextLine();
            char dtm = determine.charAt(0);
            if (dtm == 'y') {
                //input +,-,* or /
                char operator = operatorSelect();

                int answer;

                switch (operator) {
                    case '+':
                        //input two numbers
                        System.out.println("Please enter the 1st number:");
                        int number1 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 1st number you enter is: " + number1);
                        System.out.println("Please enter the 2nd number:");
                        int number2 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 2nd number you enter is: " + number2);
                        answer = addition(number1, number2);
                        System.out.println(number1 + " + " + number2 + " = " + answer);
                        break;
                    case '-':
                        //input two numbers
                        System.out.println("Please enter the 1st number:");
                        int number3 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 1st number you enter is: " + number3);
                        System.out.println("Please enter the 2nd number:");
                        int number4 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 2nd number you enter is: " + number4);
                        answer = subtraction(number3, number4);
                        System.out.println(number3 + " - " + number4 + " = " + answer);
                        break;
                    case '*':
                        //input two numbers
                        System.out.println("Please enter the 1st number:");
                        int number5 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 1st number you enter is: " + number5);
                        System.out.println("Please enter the 2nd number:");
                        int number6 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 2nd number you enter is: " + number6);
                        answer = multiplication(number5, number6);
                        System.out.println(number5 + " * " + number6 + " = " + answer);
                        break;
                    case '/':
                        //input two numbers
                        System.out.println("Please enter the 1st number:");
                        int number7 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 1st number you enter is: " + number7);
                        System.out.println("Please enter the 2nd number:");
                        int number8 = Integer.parseInt(scanner.nextLine());
                        System.out.println("The 2nd number you enter is: " + number8);
                        answer = division(number7, number8);
                        System.out.println(number7 + " / " + number8 + " = " + answer);
                        break;
                    default:
                        System.out.println("Please enter a basic operator.");
                }
            }else if(dtm == 'n'){
                keepAlive = false;
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

    public static char operatorSelect(){
        System.out.println("Please select a basic operation among +-*/.");
        String operatorInput = scanner.nextLine();
        //String converts to char
        char operator = operatorInput.charAt(0);
        return operator;
    }
}
