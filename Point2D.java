public class Point2D {
    private double x;
    private double y;


    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double newX){
        this.x = newX;
    }

    public void setY(double newY){
        this.y = newY;
    }

    public double distanceTo(Point2D other){
        double x1 = this.x;
        double x2 = other.x;
        double y1 = this.y;
        double y2 = other.y;

        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return distance;
    }

    public String toString(){
        String result = "(";
        result += x;
        result += ", ";
        result += y;
        result += ")";
        return result;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0,5);
        Point2D p2 = new Point2D(0,0);

        System.out.println(p1.distanceTo(p2));
    }
}
