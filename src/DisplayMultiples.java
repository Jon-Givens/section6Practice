import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = in.nextInt();
        int multiplied;
        for(int i = 1; i < 12; i++) {
            multiplied = input * i;
            System.out.println(input + "*" + i + "=" + multiplied);
        }
    }

}
