import java.util.Scanner;

class ShapeCalculator{
    void area(int radius){
        double a = 3.14 * radius * radius;
        int result = (int)a;
        
System.out.println("Area of Circle : " + result);
    }
    void area(int length, int widht){
        double a = length*widht;
        int result = (int)a;
        System.out.println("Area of Rectangle : " + result);
    }
    void area(int b1, int b2, double h)
    {
        double a = ((b1+b2)*h)/2;
        int result = (int)a;
        System.out.println("Area of Trapezoid : " + result);

    }
}

class Practice_Polymorphism{
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        sc.area(5);
        sc.area(4, 5);
        sc.area(3, 4, 5);
    }
}