package movablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public float[] getXY(){
        float[] res = {getX(), getY()};
        return res;
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}

class PointTest{
    public static void main(String[] args){
        Point pointA = new Point();
        System.out.println(pointA);
        pointA.setXY(1, 2);
        System.out.println(pointA);

        for (float coordinate: pointA.getXY()){
            System.out.print(coordinate+"\t");
        }
        System.out.println();

        Point pointB = new Point(-1,-2);
        System.out.println(pointB);
        pointB.setXY(-57, 104);
        System.out.println(pointB);
    }
}
