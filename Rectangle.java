public class Rectangle extends Method{
    private double width;
    private double length;

    public Rectangle(double width, double length, double perimeter, double acreage ) {
        super(perimeter, acreage);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [ " +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + getPerimeter() +
                ", acreage=" + getAcreage() +
                " ]";
    }
}
