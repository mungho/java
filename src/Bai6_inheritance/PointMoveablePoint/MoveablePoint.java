package Bai6_inheritance.PointMoveablePoint;

public class MoveablePoint extends Point{
       private float xSpeed;
       private float ySpeed;

       public MoveablePoint() {
       }

       public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
           super(x, y);
           this.xSpeed = xSpeed;
           this.ySpeed = ySpeed;
       }

       public MoveablePoint(float xSpeed, float ySpeed) {
           this.xSpeed = xSpeed;
           this.ySpeed = ySpeed;
       }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
           float[] tempArray = {this.xSpeed, this.ySpeed};
           return tempArray;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
           this.xSpeed = xSpeed;
           this.ySpeed = ySpeed;
    }

    public MoveablePoint move() {
           super.setX(this.getX() + xSpeed);
           super.setY(this.getY() + ySpeed);
           return this;
    }

    @Override
    public String toString() {
        return "[" + this.getX() + "; " + this.getY() + "], speed = [" + xSpeed + "; " + ySpeed + "]";
    }
}
