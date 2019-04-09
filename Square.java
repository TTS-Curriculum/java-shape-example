// Create a Square class
public class Square extends Shape {
  int side;

  // Create a class constructor for the Square class
  public Square(int s) {
    side = s;
  }

  public String getName() {
    return "square";
  }

  public void area() {
    System.out.println(getName() + " area: " + side * side);
  }

  public static void main(String[] args) {
    Square square = new Square(5);
    square.area();
  }
}
