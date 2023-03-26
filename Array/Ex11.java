import java.util.Random;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        Random r = new Random();
        String guess;

        do {
            int A = r.nextInt(20);
            int B = r.nextInt(20);
            char operator = '?';
            int value = 0;
            int score = 0;

            switch (r.nextInt(4)) {
                case 0:
                    operator = '+';
                    value = A + B;
                    break;
                case 1:
                    operator = '-';
                    value = A - B;

                    break;
                case 2:
                    operator = '*';
                    value = A * B;

                    break;
                case 3:
                    operator = '/';
                    value = A / B;

                    break;
                default:
                    operator = '?';
            }
            System.out.println("What is " + A + " " + operator + " " + B + " ?");
            int b = user.nextInt();

            if (b == value) {
                score++;
                System.out.println("Right Answer! ");
                System.out.println("Your get! " + score + "out of 10");

            } else {

                System.out.println("Wrong answer! Right answer is: " + value + " score is " + score);

            }

            System.out.println("Continue? y/n");
            guess = user.next();

        } while (guess.equals("y"));
    }
}