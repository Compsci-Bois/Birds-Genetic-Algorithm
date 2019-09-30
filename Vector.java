public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector(double x) {
        this.x = x;
        y = 0;
        z = 0;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        z = 0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //===============================================================================================================

    public void update(Vector other){//changes all of the fields by a Vector's parallel fields
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
    }

    public double magnitude(){
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) );//returns the magnitude of the Vector
    }

    public double difference(Vector other){//returns the difference between two Vectors
        return Math.sqrt( Math.pow( this.x - other.x, 2)+Math.pow(this.y - other.y , 2)+Math.pow(this.z - other.z , 2) );
    }

    public Vector unitVector(){//returns the unit Vector
        double magnitude = magnitude();
        return new Vector(x / magnitude, y / magnitude, z / magnitude);
    }

    //================================================================================================================

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void addX(double x){
        this.x += x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void addY(double y){
        this.y += y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void addZ(double z){
        this.z += z;
    }

    //================================================================================================================

    public String toString(){
        return (x+" - "+y+" - "+z);
    }
}
