import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;
        System.out.println("The area of the triangle is " + areaCm2 + " square cm and " + areaIn2 + " square inches.");
    }
}
