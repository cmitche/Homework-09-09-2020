import java.util.Scanner;

public class Homework {
    /*#1) Create a program that keeps asking for a password
    Make sure you are using the Scanner Class/Object
    Once the user gets the password correct
    Print out a message to the user eg: logged in
    Keep track of how many wrong attempts they made
    Then display their number of wrong attempts */
   // public static String password(){
   // }



    /*#2)
    Created a method that takes a price and a discount amount
    Calculate the final price after discounts*/
    static double discount(double price, double discountPercentage){
        double discount = discountPercentage / 100 ;
        return price - (price * discount);
    }

    /*#3)
    Complete this method
    public int lengthOfStringMethod(String x) {
    }*/
    public int lengthOfStringMethod(String x) {
        return x.length();
    }


    /*#4)
    Write a method that takes one parameter/argument and squares the number*/
    public static double square(int input){
        return Math.pow(input, 2);
    }


    /*7)Create a method that prints from 45 - 0 however it should print the following:
    1 - print Year if the number is divisible by 3
    2 - print Up if the number is divisible by 5
    3 - Print YearUp if the number is divisible by both 3 and 5 */
    public static void decreasing(){
        for (int x = 45; x >= 0; x--) {
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println("Year");
            }
            else if (x % 5 == 0 && x % 3 != 0) {
                System.out.println("Up");
            }
            else if (x % 3 == 0 && x % 5 == 0){
                System.out.println("YearUp");
            }
            else System.out.println(x);
        }
    }


    /*10)
    Create a method that calculates the circumference of a circle */
    public static double circumference(int radius){
        double answer = 2 * Math.PI * radius;
        return answer;
    }


    public static void main(String[] args) {

        /*#1) Create a program that keeps asking for a password
    Make sure you are using the Scanner Class/Object
    Once the user gets the password correct
    Print out a message to the user eg: logged in
    Keep track of how many wrong attempts they made
    Then display their number of wrong attempts */
        // String password(){
        // }
        Scanner scanner1 = new Scanner(System.in);
        int attempts = 1;
        String userNamePrompt = "Please enter username:";
        System.out.println(userNamePrompt);
        String userName = scanner1.nextLine();
        String passwordPrompt = "Please enter password:";
        System.out.println(passwordPrompt);
        String password = "P!";
        boolean indicator = false;
        while (indicator == false){
            String userPassword = scanner1.nextLine();
            if (userPassword.equals(password)){
                System.out.println("Welcome " + userName + "!");
                indicator = true;
            }
            else {
                indicator = false;
                System.out.println("Password is incorrect. Try again!");
                System.out.println("Wrong attempts: " + attempts);
                attempts++;


            }
        }


        /*#2)---Method Invoked & Printed---
        Created a method that takes a price and a discount amount
        Calculate the final price after discounts*/
        System.out.println("--- Answer #2 ---");
        System.out.println(discount(100,20));

        /*#3)---Method Invoked & Printed---
        Complete this method
        public int lengthOfStringMethod(String x) {}*/
        String nickname = "Super Negro";
        System.out.println("--- Answer #3 ---");
        System.out.println(nickname);

        /*#4)---Method Invoked & Printed---
        Write a method that takes one parameter/argument and squares the number
        Invoke and print the method to test that it works as intended.*/
        System.out.println("--- Answer #4 ---");
        System.out.println(square(10));

        /*#5)
        Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop*/
        int x = 10;
        System.out.println("--- Answer #5 ---");
        while (x >= 0){
            if(x==5) {
                break;
            }//end of if
            else if(x % 2 == 0){
            System.out.println(x);}//end of else if
            x--;
        }//End of while loop.

        /*6) Create a program that scans for a student's number grade number prints a student's letter grade based on the following conditions:
        if a student's grade is between 90 and 100 then print you got an A
        if a student's grade is between 89 and 80 then print you got a B
        if a student's grade is between 79 and 70 then print you got a C
        if a student's grade is between 69 and 60 then print you got an D
        if a student's grade is  59 and below then print you got an F */
        System.out.println("--- Answer #6 ---");
        System.out.println("What is the student's grade number?");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <= 100){
            System.out.println("You got an A!");
        }else if (grade <= 89 && grade >= 80)
            System.out.println("You got an B!");
        else if (grade <= 79 && grade >= 70)
            System.out.println("You got an C!");
        else if (grade <= 69 && grade >= 60)
            System.out.println("You got an D!");
        else System.out.println("You suck! Go Home!");

        /*7)---Method Invoked & Printed---
        Create a method that prints from 45 - 0 however it should print the following:
    1 - print Year if the number is divisible by 3
    2 - print Up if the number is divisible by 5
    3 - Print YearUp if the number is divisible by both 3 and 5 */
        System.out.println("--- Answer #7 ---");
        decreasing();

        /*8)
        Create an array of your top 5 artist
        Write a loop to print them all out!*/
        String[] artists = {"Stevie Wonder", "Teena Marie", "Luther Vandross", "Lil Wayne", "Michael Jackson"};
        System.out.println("--- Answer #8 ---");
        for(String a : artists ){
            System.out.println(a);
        }

        /*#9)
        Write a while loop that prints only even numbers from 10 - 0 but once the loop gets to 5 break out of the loop*/
        int y = 10;
        System.out.println("--- Answer #9 ---");
        while (y <= 10){
            if(y==5) {
                break;
            }
            System.out.println(y);
            y--;
        }

        /*10)---Method Invoked & Printed---
        Create a method that calculates the circumference of a circle */
        System.out.println("--- Answer #10 ---");
        System.out.println(circumference(3));
    }//End of main
}//End of class
