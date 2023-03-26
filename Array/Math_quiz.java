
import java.util.Random;
import java.util.Scanner;

public class Math_quiz {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String guess;

        do {
            Random number = new Random();
            int num1 = number.nextInt(20);
            int num2 = number.nextInt(20);
            String operatorSwitch = null;
            int b ;
            Random operatorChoice = new Random();
            int operator = operatorChoice.nextInt(4);
            int answer = num1+operator+num2;;

            switch (operator){
                case 0:
                     System.out.println(num1 + " + " + num2);
                     break;
                case 1:
                     System.out.println(num1 + " - " + num2);
                     break;
                case 2:
                     System.out.println(num1 + " * " + num2);
                     break;
                case 3:
                     System.out.println(num1 + " / " + num2);
                     break;
             }
            System.out.println("What is: " + num2 + operatorSwitch + num2 + "?");
            b = user.nextInt();

            if (b == answer) {
                System.out.println("Right answer!" + answer);

            }

            else {
                System.out.println("Wrong answer! Right answer is: " + answer);

            }

            System.out.println("Continue? y/n");
            guess = user.next();

        } while (guess.equals("y"));

    }
}
