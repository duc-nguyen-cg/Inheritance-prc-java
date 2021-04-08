package point;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D(){
    }

    Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ( float x, float y, float z){
        super.setXY(x, y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] res = {getX(), getY(), z};
        return res;
    }

    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }
}

class Point3DTest{
    public static void main (String[] args){
        Point3D pointC = new Point3D();
        System.out.println(pointC);

        Point3D pointD = new Point3D(1,2,3);
        System.out.println(pointD);
        pointD.setXYZ(3,2,1);
        System.out.println(pointD);

        for (float coordinate: pointD.getXYZ()){
            System.out.print(coordinate+"\t");
        }

    }
}
