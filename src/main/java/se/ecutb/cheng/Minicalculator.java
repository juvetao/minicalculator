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
                        int number1 = inputNumbers();
                        int number2 = inputNumbers();
                        boolean onemorenumber = true;
                        answer = addition(number1, number2);
                        System.out.println("Do you want to enter one more number to calculate? y/n");
                        String onemorenumberyn = scanner.nextLine();
                        char omn = onemorenumberyn.charAt(0);
                        while (onemorenumber) {
                            if (omn == 'y') {
                                number1 = inputNumbers();
                                answer = addition(answer, number1);
                                //System.out.println(number1 + " + " + number2 + " = " + answer);
                                System.out.println("answer: " + answer);
                                System.out.println("Enter one more? y/n");
                                String onemore = scanner.nextLine();
                                char om = onemore.charAt(0);
                                if (om == 'y'){
                                    int number = inputNumbers();
                                    answer = addition(answer, number);
                                    System.out.println("answer: " + answer);
                                }else if (om == 'n'){
                                    //System.out.println("answer: " + answer);
                                    onemorenumber = false;
                                }
                                //Here is the bug...
                            } else if (omn == 'n') {
                                System.out.println(number1 + " + " + number2 + " = " + answer);
                                onemorenumber = false;
                            }
                        }
                        break;
                    case '-':
                        //input two numbers
                        int number3 = inputNumbers();
                        int number4 = inputNumbers();
                        boolean onemorenumber1 = true;
                        answer = subtraction(number3, number4);
                        System.out.println("Do you want to enter one more number to calculate? y/n");
                        String onemorenumberyn1 = scanner.nextLine();
                        char omn1 = onemorenumberyn1.charAt(0);
                        while (onemorenumber1) {
                            if (omn1 == 'y') {
                                number3 = inputNumbers();
                                answer = subtraction(answer,number3);
                                System.out.println("answer: " + answer);
                                System.out.println("Enter one more? y/n");
                                String onemore = scanner.nextLine();
                                char om = onemore.charAt(0);
                                if (om == 'y'){
                                    int number = inputNumbers();
                                    answer = subtraction(answer, number);
                                    System.out.println("answer: " + answer);
                                }else if (om == 'n'){
                                    //System.out.println("answer: " + answer);
                                    onemorenumber1 = false;
                                }
                                //Here is the bug...
                            } else if (omn1 == 'n') {
                                //answer = subtraction(number3, number4);
                                System.out.println(number3 + " - " + number4 + " = " + answer);
                                onemorenumber1 = false;
                            }
                        }
                        break;
                    case '*':
                        //input two numbers
                        int number5 = inputNumbers();
                        int number6 = inputNumbers();
                        answer = multiplication(number5,number6);
                        System.out.println(number5 + " * " + number6 + " = " + answer);
                        break;
                    case '/':
                        //input two numbers
                        int number7 = inputNumbers();
                        int number8 = inputNumbers();
                        answer = division(number7,number8);
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

    //Select Operator
    public static char operatorSelect(){
        boolean keepAlive = true;
        char operator = ' ';
        while (keepAlive){
        System.out.println("Please select a basic operation among +-*/.");
        //exception: enter nothing (press "Enter" only)
        try{
        String operatorInput = scanner.nextLine();
        //String converts to char
        operator = operatorInput.charAt(0);
        keepAlive = false;}
        catch (StringIndexOutOfBoundsException sioobe){
            System.out.println(sioobe.getMessage());}
        }
        return operator;
    }

    //Input numbers
    public static int inputNumbers() {
        boolean keepAlive = true;
        int number = 0;
        while(keepAlive) {
            System.out.println("Please enter a number:");
            //exception: enter a letter instead
            try {
                number = Integer.parseInt(scanner.nextLine());
                keepAlive = false;
                System.out.println("The number you enter is: " + number);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
                System.out.println("Only numbers are allowed!");
            }
        }
        return number;
    }
}
