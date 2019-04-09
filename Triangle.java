import java.util.Scanner;

// Create a Triangle class
public class Triangle implements Shape {
  int height;
  int base;

  // Create a class constructor for the Triangle class
  public Triangle() {
    // Create a Scanner object
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter height: ");

    // Read user input
    height = Integer.parseInt(myObj.nextLine());
    System.out.print("Enter base: ");

    // Read user input
    base = Integer.parseInt(myObj.nextLine());
  }

  public String getName() {
    return "triangle";
  }

  public void area() {
    System.out.println(getName() + " area: " + (height*base/2));
  }

  public static void main(String[] args) {
    Triangle t = new Triangle();
    t.area();
  }
}
