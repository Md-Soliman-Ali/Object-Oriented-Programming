package polymorphism;

public class triangle  extends shape{
    
    double base,height;
    
    triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area()
    {
        System.out.println("Triangle");
        return 0.5*base*height;
    }
    
}
