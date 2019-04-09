// Create a Triangle class
public class Triangle extends Shape {
  int height;
  int base;

  // Create a class constructor for the Triangle class
  public Triangle(int h, int b) {
    height = h;
    base = b;
  }

  public String getName() {
    return "triangle";
  }

  public void area() {
    System.out.println(getName() + " area: " + (height*base/2));
  }

  public static void main(String[] args) {
    Triangle t = new Triangle(3, 6);
    t.area();
  }
}
