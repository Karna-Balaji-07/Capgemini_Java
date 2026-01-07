package OOPs.Abstraction;
// shape - area - rectange, cirle, square

abstract class Shape
{
    abstract double Area();
}

class rectange extends Shape
{
    double length;
    double breadth;
    public rectange(int l,int b){
        this.length= l;
        this.breadth = b;
    }

    @Override
    double Area() {
        return this.breadth * this.length;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double r) {
        this.radius = r;
    }

    @Override
    double Area() {
        return 3.14 * Math.pow(this.radius,2);
    }
}

class Square extends Shape
{
    double side;
    public Square(double s){
        this.side = s;
    }

    @Override
    double Area() {
        return Math.pow(this.side,2);
    }
}
public class Program_1 {
    public static void main(String[] args) {
        rectange rec = new rectange(10,21);
        Square s = new Square(12);
        Circle c = new Circle(11.23);
        System.out.println(rec.Area());
        System.out.println(s.Area());
        System.out.println(c.Area());
    }
}
