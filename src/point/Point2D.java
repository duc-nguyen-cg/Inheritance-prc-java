package point;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y){
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
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] res = {x, y};
        return res;
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}

class Point2DTest{
    public static void main (String[] args){
        Point2D pointA = new Point2D();
        System.out.println(pointA);


        Point2D pointB = new Point2D(2, 4);
        System.out.println(pointB);
        pointB.setXY(4, 2);
        System.out.println(pointB);

        for (float coordinate: pointB.getXY()){
            System.out.print(coordinate+"\t");
        }
    }
}
