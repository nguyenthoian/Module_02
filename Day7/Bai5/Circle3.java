public class Circle3 extends Shape3 implements Colorable3{
    private double radius = 1.0;

    public void howToColor(){
        System.out.println("Color all four sides");
    }

    public Circle3() {
    }

    public Circle3(double radius) {
        this.radius = radius;
    }

    public Circle3(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
