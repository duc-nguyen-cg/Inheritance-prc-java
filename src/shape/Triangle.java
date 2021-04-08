package shape;
import java.util.Scanner;

public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide(double side1, double side2, double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double[] getSide(){
        double[] res = {getSide1(), getSide2(), getSide3()};
        return res;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }

    public String toString(){
        return "A triangle with sides = "
                + side1 + ", "
                + side2 + ", "
                + side3
                + ", perimeter = " + getPerimeter()
                + ", area = " + getArea()
                + ", which is a sub class of "
                + super.toString();
    }
}

class TriangleTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 3 sides: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        if (side1 + side2 > side3 & side2 + side3 > side1 & side3 + side1 > side2){
            Triangle tri1 = new Triangle(side1,side2,side3,"red", true);
            System.out.println(tri1);
            tri1.setSide( 5, 12, 13);
            tri1.setFilled(false);
            tri1.setColor("green");
            System.out.println(tri1);
        } else {
            System.out.println("The triangle does not exist");
        }
    }
}
