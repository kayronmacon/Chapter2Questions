import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // 2.25
        Scanner scan = new Scanner(System.in);
        System.out.println("Check if number is divisible by 3");
        System.out.println("======================================");
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        if(n % 3 == 0 ) {
            System.out.println("This is divisible by 3");
        } else {
            System.out.println("not divisible by 3");
        }

        //2.26

        System.out.println("Check if number tripled is a multiple of number doubled");
        System.out.println("======================================");
        System.out.println("Enter number to be tripled");
        int n1 = scan.nextInt();
        System.out.println("Enter number to be doubled");
        int b = scan.nextInt();
        int x = n1 *3;
        int y = b*2;
        if(x % y == 0) {
            System.out.println("is a multiple");
        } else {
            System.out.println("isnt a multiple");
        }

        //2.28
        System.out.println("Determine the diameter, circumference, and area dependent on a circles radius");
        System.out.println("======================================");
        System.out.println("Enter a radius");
        int r = scan.nextInt();
        scan.close();
        double diameter = 2*r;
        double circumference = 2* Math.PI* r;
        double area = Math.PI* (r*r);
        System.out.printf("Diameter: " + "%f%n", diameter);
        System.out.printf("Circumference: " +"%f%n", circumference);
        System.out.printf("Area: " +"%f%n", area);
    }



    }





