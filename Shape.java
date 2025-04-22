


interface Shape{
    public float PI = 3.14f;
    public float area();
    public float perimeter();
}

class Circle implements Shape{
    public int radius = 5;
    public float area(){
        return PI * radius * radius;
    }
    public float perimeter(){
        return 2 * PI * radius;
    }

}

class Rectangle implements Shape{
    int length = 5, breath = 6;
    public float area(){
        return length * breath;
    }
    public float perimeter(){
        return 2 * (length + breath);
    }
}

public class Shapes7{
    public static void main(String args[]){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println("Area of circle : " + c.area());
        System.out.println("Perimeter of circle : " + c.perimeter());
        System.out.println("Area of rectangle : " + r.area());
        System.out.println("Perimeter of rectangle : " + r.perimeter());
    }
}

