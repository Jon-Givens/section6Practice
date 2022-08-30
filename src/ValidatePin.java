import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int PIN = 1596;
        int inputPIN;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your PIN");
        inputPIN = in.nextInt();

        while(inputPIN != PIN) {
            System.out.println("Wrong PIN, try again");
            inputPIN = in.nextInt();
        }

        System.out.println("Correct PIN, welcome to your account");
    }
}
