package cylinder;

public class Cylinder extends Circle{
    double height = 1.0;

    Cylinder(){
    }

    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    public String toString(){
        return "A Cylinder with height = "+height+", volume = "+getVolume()+", which is a subclass of "+super.toString();
    }
}

class CylinderTest{
    public static void main (String[] args){
        Circle c1 = new Cylinder();//implicit casting
        System.out.println(c1);

        Cylinder c2 = new Cylinder(2.0, 5.0, "blue");
        System.out.println(c2);
    }
}
