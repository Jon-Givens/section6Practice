import java.util.Scanner;

public class LoopShape {
    static Scanner in = new Scanner(System.in);
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        int i = 1;

        while(width < 1) {
            System.out.println("Width is too small, enter a new width: ");
            width = in.nextInt();
        }
        while(height < 1) {
            System.out.println("Height is too small, enter a new height: ");
            height = in.nextInt();
        }

        while(i == 1) {
            for(int a = width; a > 0; a--) { //this part prints the top line, making it as long as the width
                System.out.print("*");
            }
            System.out.print("\n");
            i++;
        }
        while(i < height) { //this is middle sections

                System.out.print("*"); //beginning of the line
                for(int b = width - 2; b > 0; b--) { //this figures out how much middle space there should be
                    System.out.print(" "); //middle space
                }
                System.out.println("*"); //right side

            i++;
        }

        while(i == height) {
            for(int a = width; a > 0; a--) { //same as the top but for the bottom
                System.out.print("*");
            }
            i++;
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        System.out.println("\n");
        int i = 1;
        int a = 0;

        if(leg < 1) {
            System.out.println("leg is too small, enter a new leg length: ");
            leg = in.nextInt();
        }

        while(i == 1) { //this prints the top of the triangle
            System.out.println("*");
            i++;
        }
         while(i < leg) {

            System.out.print("*");
            for(int b = 0; b < a; b++){
                System.out.print(" ");
            }

            System.out.print("*\n");
            a++;
                    i++;
        }

        while(i == leg) { //this prints the bottom of the triangle
            for(int b = leg; b > 0; b-- ) {
                System.out.print("*");
            }
            i++;
        }
        
    }
}
