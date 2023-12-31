public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Invalid triangle sides: " + side1 + ", " + side2 + ", " + side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Các phương thức khác của lớp Triangle
}
