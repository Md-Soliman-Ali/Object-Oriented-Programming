package polymorphism;

public class Test {
    
    public static void main (String[] args) 
    {
        shape s1 = new shape();
        shape s2 = new rectangle(10,20);
        shape s3 = new triangle (10,20);
        
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
    
}