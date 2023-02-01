package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.setLength(width);
    }

    public double getPerimeter() {
        System.out.println("getPerimeter from Sq");
        return 4 * super.length;
    }

    public double getArea() {
        System.out.println("getArea from Sq");
        return Math.pow(super.width, 2);
    }

}
