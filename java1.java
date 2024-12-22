
abstract class Shape {
    public abstract double calculateArea(); 
    public abstract double calculatePerimeter(); 


class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || 
            (sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; 
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); 

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            
            Shape rectangle = new Rectangle(5, 10);
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

            
            Shape circle = new Circle(7);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        
            Shape triangle = new Triangle(3, 4, 5);
            System.out.println("Triangle Area: " + triangle.calculateArea());
            System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
            
           
            Shape invalidTriangle = new Triangle(1, 2, 10);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
