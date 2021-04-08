package movablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed(){
        float[] res = {getXSpeed(), getYSpeed()};
        return res;
    }

    public String toString(){
        return super.toString()+", speed = ("+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}

class MovablePointTest{
    public static void main(String[] args){
        MovablePoint pointC = new MovablePoint();
        System.out.println(pointC);
        pointC.setXY(1,2);
        pointC.setSpeed(10, 5);
        System.out.println(pointC);

        for (int i = 0; i < 100; i++){
            pointC = pointC.move();
        }
        System.out.println(pointC);


    }
}
