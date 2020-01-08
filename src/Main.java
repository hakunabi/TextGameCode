
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome! You will have unlimited time to answer 10 questions. The questions will get " +
                        "harder and harder as you progress.");
        System.out.println("If you get a question wrong, its game over! Have fun!");
        System.out.println("-Baegel, William B., Henry T., Dylan B.");


        System.out.println();

        System.out.println("If you would like to begin, type 1. If not, type 2.");
        Scanner sc99 = new Scanner(System.in);
        int z = 1;

        while (z == 1) {
            System.out.println("Type here: ");
            int userInput = sc99.nextInt();

            if (userInput == 1) {
                break;
            }
            if (userInput == 2) {
                System.out.println("bye bye!");
                System.exit(0);
            }
        }

        System.out.println("Question 1: " + Questions.questionBank1[Questions.Random1]);
        System.out.println(Questions.answerChoiceA1[Questions.Random1]);
        System.out.println(Questions.answerChoiceB1[Questions.Random1]);
        System.out.println(Questions.answerChoiceC1[Questions.Random1]);
        System.out.println(Questions.answerChoiceD1[Questions.Random1]);

        Scanner sc1 = new Scanner(System.in);

        int a = 4;

        while (a == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc1.nextInt();

            if (userInput != Questions.answerBank1[Questions.Random1]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 1/10");
                break;
            }
        }
        System.out.println("Question 2: " + Questions.questionBank2[Questions.Random2]);
        System.out.println(Questions.answerChoiceA2[Questions.Random2]);
        System.out.println(Questions.answerChoiceB2[Questions.Random2]);
        System.out.println(Questions.answerChoiceC2[Questions.Random2]);
        System.out.println(Questions.answerChoiceD2[Questions.Random2]);
        Scanner sc2 = new Scanner(System.in);

        int b = 4;

        while (b == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc2.nextInt();

            if (userInput != Questions.answerBank2[Questions.Random2]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 2/10");
                break;
            }
        }
        System.out.println("Question 3: " + Questions.questionBank3[Questions.Random3]);
        System.out.println(Questions.answerChoiceA3[Questions.Random3]);
        System.out.println(Questions.answerChoiceB3[Questions.Random3]);
        System.out.println(Questions.answerChoiceC3[Questions.Random3]);
        System.out.println(Questions.answerChoiceD3[Questions.Random3]);
        Scanner sc3 = new Scanner(System.in);

        int c = 4;

        while (c == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc3.nextInt();

            if (userInput != Questions.answerBank3[Questions.Random3]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 3/10");
                break;
            }
        }
        System.out.println("Question 4: " + Questions.questionBank4[Questions.Random4]);
        System.out.println(Questions.answerChoiceA4[Questions.Random4]);
        System.out.println(Questions.answerChoiceB4[Questions.Random4]);
        System.out.println(Questions.answerChoiceC4[Questions.Random4]);
        System.out.println(Questions.answerChoiceD4[Questions.Random4]);
        Scanner sc4 = new Scanner(System.in);

        int d = 4;

        while (d == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc4.nextInt();

            if (userInput != Questions.answerBank4[Questions.Random4]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 4/10");
                break;
            }
        }
        System.out.println("Question 5: " + Questions.questionBank5[Questions.Random5]);
        System.out.println(Questions.answerChoiceA5[Questions.Random5]);
        System.out.println(Questions.answerChoiceB5[Questions.Random5]);
        System.out.println(Questions.answerChoiceC5[Questions.Random5]);
        System.out.println(Questions.answerChoiceD5[Questions.Random5]);
        Scanner sc5 = new Scanner(System.in);

        int e = 4;

        while (e == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc5.nextInt();

            if (userInput != Questions.answerBank5[Questions.Random5]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 5/10");
                break;
            }
        }
        System.out.println("Question 6: " + Questions.questionBank6[Questions.Random6]);
        System.out.println(Questions.answerChoiceA6[Questions.Random6]);
        System.out.println(Questions.answerChoiceB6[Questions.Random6]);
        System.out.println(Questions.answerChoiceC6[Questions.Random6]);
        System.out.println(Questions.answerChoiceD6[Questions.Random6]);
        Scanner sc6 = new Scanner(System.in);

        int j = 4;

        while (j == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc6.nextInt();

            if (userInput != Questions.answerBank6[Questions.Random6]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 6/10");
                break;
            }
        }
        System.out.println("Question 7: " + Questions.questionBank7[Questions.Random7]);
        System.out.println(Questions.answerChoiceA7[Questions.Random7]);
        System.out.println(Questions.answerChoiceB7[Questions.Random7]);
        System.out.println(Questions.answerChoiceC7[Questions.Random7]);
        System.out.println(Questions.answerChoiceD7[Questions.Random7]);
        Scanner sc7 = new Scanner(System.in);

        int f = 4;

        while (f == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc7.nextInt();

            if (userInput != Questions.answerBank7[Questions.Random7]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 7/10");
                break;
            }
        }
        System.out.println("Question 8: " + Questions.questionBank8[Questions.Random8]);
        System.out.println(Questions.answerChoiceA8[Questions.Random8]);
        System.out.println(Questions.answerChoiceB8[Questions.Random8]);
        System.out.println(Questions.answerChoiceC8[Questions.Random8]);
        System.out.println(Questions.answerChoiceD8[Questions.Random8]);
        Scanner sc8 = new Scanner(System.in);

        int g = 4;

        while (g == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc8.nextInt();

            if (userInput != Questions.answerBank8[Questions.Random8]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 8/10");
                break;
            }
        }
        System.out.println("Question 9: " + Questions.questionBank9[Questions.Random9]);
        System.out.println(Questions.answerChoiceA9[Questions.Random9]);
        System.out.println(Questions.answerChoiceB9[Questions.Random9]);
        System.out.println(Questions.answerChoiceC9[Questions.Random9]);
        System.out.println(Questions.answerChoiceD9[Questions.Random9]);
        Scanner sc9 = new Scanner(System.in);

        int h = 4;

        while (h == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc9.nextInt();

            if (userInput != Questions.answerBank9[Questions.Random9]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 9/10");
                break;
            }
        }
        System.out.println("Question 10: " + Questions.questionBank10[Questions.Random10]);
        System.out.println(Questions.answerChoiceA10[Questions.Random10]);
        System.out.println(Questions.answerChoiceB10[Questions.Random10]);
        System.out.println(Questions.answerChoiceC10[Questions.Random10]);
        System.out.println(Questions.answerChoiceD10[Questions.Random10]);
        Scanner sc = new Scanner(System.in);

        int i = 4;

        while (i == 4) {
            System.out.println("What's your answer? (Answer in 1-4):");
            int userInput = sc.nextInt();

            if (userInput != Questions.answerBank10[Questions.Random10]) {
                System.out.println("Wrong! You lose!");
                System.exit(0);
            } else {
                System.out.println("Correct! 10/10");
                break;
            }
        }
    }
}