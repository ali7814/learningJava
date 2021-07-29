import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
      double area = triangleA.findArea();
      System.out.println("Area is: " + area + " " + triangleA.getSideLenThree);

        System.out.println("Num of sides: " + Triangle.numOfSides);
    }
}
