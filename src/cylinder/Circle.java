package cylinder;

public class Circle {
    double radius = 1.0;
    String color = "green";

    Circle(){
    }

    Circle(double radius, String color){
        this. radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius = "+radius+", color = "+color+", and area = "+getArea();
    }
}

class CircleTest{
    public static void main (String[] args){
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(5.0, "red");
        System.out.println(c2);
    }
}
