package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner s = new Scanner(System.in);

        // Q1: To print the sum, multiply, subtract, division and remainder
//        System.out.print("Enter the first number: ");
//        int firstNum = s.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int secondNum = s.nextInt();
//
//        System.out.println("The sum is: " + (firstNum + secondNum));
//        System.out.println("The subtract is: " + (firstNum - secondNum));
//        System.out.println("The multiplication is: " + (firstNum * secondNum));
//        System.out.println("The division is: " + (firstNum / secondNum));
//        System.out.println("The remainder is: " + (firstNum % secondNum));

        // Q2: Multiplication table
//        System.out.print("Enter any number: ");
//        int num = s.nextInt();
//
//        System.out.println("Multiplication table: ");
//        for(int i = 1 ; i <= 10 ; i++){
//            System.out.println("The result for " + num + " * " + i + " is: " + (i * num));
//        }

        // Q3: To print the area and perimeter of circle
//        System.out.print("Enter the radius: ");
//        double radius = s.nextDouble();
//        System.out.println("Perimeter is: " + (2*3.14*radius));
//        System.out.println("Area is: " + (3.14*(radius*radius)));

        // Q4: To find the average of a set if integers
//        System.out.println("Enter the count of numbers: ");
//        double setOfIntegers = s.nextInt();
//
//        double sum = 0;
//        for(int i = 1 ; i <= setOfIntegers ; i++){
//            System.out.println("Enter an integer: ");
//            int anyNumber = s.nextInt();
//            sum+= anyNumber;
//        }
//        double averageResult = sum / setOfIntegers;
//        System.out.println("The average is: " + averageResult );

        // Q5: Comparison the sum with the third integer
//        System.out.println("Enter the first number: ");
//        int num1 = s.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = s.nextInt();
//        System.out.println("Enter the third number: ");
//        int num3 = s.nextInt();
//
//        int sumOfFirstTwoIntegers = num1 + num2;
//        System.out.println("The result is: " + (sumOfFirstTwoIntegers == num3));

        // Q6: To reverse a word
//        System.out.println("Please input a word: ");
//        String anyWord = s.nextLine();
//
//        String reversedWord = "";
//        for(int i = anyWord.length()-1 ; i >= 0 ; i--){
//
//            reversedWord+=anyWord.charAt(i);
//        }
//        System.out.println("The reversed word: " + reversedWord);

        // Q7: To check even or odd
//        System.out.println("Enter a number: ");
//        int number = s.nextInt();
//        if(number % 2 == 0){
//            System.out.println("The number is even");
//        } else{
//            System.out.println("The number is odd");
//        }

        // Q8: To convert temp to Fahrenheit
//        System.out.println("Enter temperature in Centigrade: ");
//        double tempInCentigrade = s.nextDouble();
//
//        System.out.println("Temperature in Fahrenheit is: " + ((tempInCentigrade * 1.8) + 32) );

        // Q9: To print the index character
//        System.out.println("Please input a string: ");
//        String anyString = s.nextLine();
//
//        System.out.println("Please input a number: ");
//        int q9Number = s.nextInt();
//
//        System.out.println("The index character is: " + anyString.charAt(q9Number));

        // Q10: To print the area and perimeter of a rectangle
//        System.out.println("Enter the width: ");
//        double width = s.nextDouble();
//        System.out.println("Enter the height: ");
//        double height = s.nextDouble();
//
//        System.out.println("The area is: " + (width * height));
//        System.out.println("The perimeter is: " + (2 * (width + height)));

        // Q11: To compare two numbers
//        System.out.println("Input first integer: ");
//        int firstNumber = s.nextInt();
//
//        System.out.println("Input second integer: ");
//        int secondNumber = s.nextInt();
//
//        if(firstNumber != secondNumber){
//            System.out.println(firstNumber + " != " + secondNumber);
//        }
//        if(firstNumber < secondNumber){
//            System.out.println(firstNumber + " < " + secondNumber);
//        }
//        if(firstNumber <= secondNumber){
//            System.out.println(firstNumber + " <= " + secondNumber);
//        }

        // Q12: To convert seconds to hours, minutes and seconds
//        System.out.println("Enter seconds: ");
//        int seconds = s.nextInt();
//        System.out.println("The result is: " + () + ":" + () + ":" + ());

        // Q13: To print if the four numbers are equal or not
//        System.out.println("Input the first number: ");
//        int firstInput = s.nextInt();
//
//        System.out.println("Input the second number: ");
//        int secondInput = s.nextInt();
//
//        System.out.println("Input the third number: ");
//        int thirdInput = s.nextInt();
//
//        System.out.println("Input the fourth number: ");
//        int fourthInput = s.nextInt();
//
//        if(firstInput == secondInput){
//            if(firstInput == thirdInput){
//                if(firstInput == fourthInput){
//                    System.out.println("Numbers are equal!");
//                }
//                else{
//                    System.out.println("Numbers are not equal!");
//                }
//            }
//            else{
//                System.out.println("Numbers are not equal!");
//            }
//        }
//        else{
//            System.out.println("Numbers are not equal!");
//        }

        // Q14: To check an integer whether it is negative, zero or positive
//        System.out.println("Please enter integer: ");
//        int numType = s.nextInt();
//
//        if(numType < 0){
//            System.out.println("Number is negative");
//        }
//        else if(numType == 0){
//            System.out.println("Number is zero");
//        }
//        else if (numType > 0){
//            System.out.println("Number is positive");
//        }

         //Q15: To count positive, negative and zeros
//        System.out.println("Please enter number (enter -1 to terminate): ");
//        int enteredNum = s.nextInt();
//
//        int positiveCounter = 0;
//        int negativeCounter = 0;
//        int zeroCounter = 0;
//
//        while(enteredNum != -1){
//            System.out.println("Please enter number (enter -1 to terminate): ");
//            enteredNum = s.nextInt();
//
//            if(enteredNum < 0){
//                negativeCounter++;
//            }
//            else if(enteredNum == 0){
//                zeroCounter++;
//            }
//            else if (enteredNum > 0){
//                positiveCounter++;
//            }
//
//        }
//        System.out.println(positiveCounter + "positives");
//        System.out.println(zeroCounter + "zero");
//        System.out.println(negativeCounter + "negatives");

        // Q16: To reverse an integer
//        System.out.println("Please enter an integer: ");
//        int randomInt = s.nextInt();
//
//        for( int i=randomInt.length()- ; ; ){
//
//        }

        // Q17: to display the largest and smallest numbers
//        System.out.println("Please enter an integer: ");
//        int largestInt = s.nextInt();
//        int smallestInt = 0;
//
//        if (largestInt < smallestInt){
//            smallestInt = largestInt;
//        }
//        else if(smallestInt > largestInt){
//            largestInt = smallestInt;
//        }
//
//        while(){
//
//        }
//        System.out.println("The largest number: " + largestInt);
//        System.out.println("The largest number: " + smallestInt);


        // Q18: number of times of a character
//        System.out.println("Enter a string: ");
//        String anyInputString = s.nextLine();
//
//        System.out.println("Enter a: ");
//        String anyInputA = s.nextLine();
//
//
//        int aLetterCounter = 0;
//
//        for(int i=0 ; i <= anyInputString.length()-1 ; i++){
//            if(anyInputString.charAt(i) == anyInputA.charAt(0)){
//                aLetterCounter++;
//            }
//        }
//        System.out.println("Number of a's: " + aLetterCounter);


















    }
}
