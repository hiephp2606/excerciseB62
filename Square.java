public class Square extends  Method {
    private double side;

    public Square(double side, double perimeter, double acreage) {
        super(perimeter, acreage);
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square [ " +
                "side=" + side +
                ", perimeter=" + getPerimeter() +
                ", acreage=" + getAcreage() +
                " ]";
    }
}
