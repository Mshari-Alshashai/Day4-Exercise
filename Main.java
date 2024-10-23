import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//1.Write a program that prints the numbers from 1 to 100 such that: If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0) System.out.println("Buzz");
            else if (i%3==0) System.out.println("Fizz");
            else
            System.out.println(i);
        }

//2.Write a Java program to reverse a string. Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT
        System.out.println(" Enter your sentence:");
        String userInput = input.nextLine();
        for (int i = userInput.length()-1; i >= 0 ; i--) System.out.print(userInput.charAt(i));

//3.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int fac = 1;
        while(num>0){
            fac=fac*num;
            num--;
        }
        System.out.println(fac);

//4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int res = 1;
        while(num2>0){
            res = res*num1;
            num2--;
        }
        System.out.println("the result is: "+res);

//5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.println("Enter a set of numbers or enter 0 to quit");
        int number = input.nextInt();
        int sumE = 0;
        int sumO = 0;
        while(number!=0){
            if(number%2 == 0){
                sumE = sumE + number;
            }else sumO = sumO + number;

            System.out.println("Enter the next number or 0 to quit");
            number = input.nextInt();
        }
        System.out.println("Even sum = " + sumE);
        System.out.println("Odd sum = "+sumO);

//6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number
        System.out.println("Enter a positive number: ");
        int userNumber = input.nextInt();
        if(userNumber<=1) System.out.println("not a prime number");
        boolean isPrime = true;

        for (int i = 2; i < userNumber ; i++) {
           if(userNumber%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)System.out.println("Prime number");
        else System.out.println("not a prime number");

//7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("  Day " + day);
            }
            System.out.println();
        }

//8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        word = word.toLowerCase();
        boolean isPalindrome = true;
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
}