package Bai6_inheritance.Point2D3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(float x, float y, float z) {
        float[] tempArray = {x, y, z};
        return tempArray;
    }

    @Override
    public String toString() {
        return "[" + this.getX() + ";  " + this.getY() + "; " + this.getZ() + "]";
    }
}
