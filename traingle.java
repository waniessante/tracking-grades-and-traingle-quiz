public class Triangle {

    // Instance variables
    private double sideA;
    private double sideB;
    private double sideC;

    // Static variable to track object count across all instances
    private static int count = 0;

    // 1. Default constructor (sides = 1.0)
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }

    // 2. One-parameter constructor (Equilateral)
    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        count++;
    }

    // 3. Two-parameter constructor (Isosceles: x, x, y)
    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        count++;
    }

    // 4. Three-parameter constructor (Scalene/General: x, y, z)
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        count++;
    }

    // 5. Copy constructor (Clone existing triangle)
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;
    }

    // Class method to return total objects created
    public static int objectCount() {
        return count;
    }

    // Instance method: calculates perimeter
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Instance method: checks if triangle is right-angled (Pythagorean theorem)
    public boolean isRightAngled() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;

        // Checks all possible hypotenuse orientations
        return (Math.abs((a2 + b2) - c2) < 0.0001) ||
               (Math.abs((a2 + c2) - b2) < 0.0001) ||
               (Math.abs((b2 + c2) - a2) < 0.0001);
    }

    // String representation of the current object
    @Override
    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
