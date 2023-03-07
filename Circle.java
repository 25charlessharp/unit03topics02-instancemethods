public class Circle {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumfrence(){
        return 2 * Math.PI * radius;
    }

    public boolean intersects(Circle other){
        boolean intersect = false;
        boolean contain = false;
        double placeholder = other.radius;
        if(other.radius > this.radius){
            other.radius = this.radius;
            this.radius = placeholder;
        }
        if(this.center.distanceTo(other.center) + other.radius < this.radius){
            contain = true;
        }
        if(this.center.distanceTo(other.center) <= this.radius + other.radius && contain == false){
            intersect = true;
        }
        return intersect;
    }

    public boolean contains(Circle other){
        boolean contain = false;
        double placeholder = other.radius;
        if(other.radius > this.radius){
            other.radius = this.radius;
            this.radius = placeholder;
            
         }
        
        if(this.center.distanceTo(other.center) + other.radius < this.radius){
            contain = true;
        }
        return contain;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(-2,0);

        Circle c1 = new Circle(p1,2);
        Circle c2 = new Circle(p2,4);
        // System.out.println(c1.getArea());
        // System.out.println(c2.getCircumfrence());
        System.out.println(c1.intersects(c2));
        System.out.println(c1.contains(c2));
    }
    
}


