package calculator;

public class Calculator {

    int result;
    int sum(int a)
    {
        result = a;
        return 0;
    }
    
    int sum(int a,int b)
    {
        result =a+b;
        return 0;
    }
     
    int sum(int a,int b,int c)
    {
        result =a+b-c;
        return 0;
    }
    
    public void display()
    {
        System.out.println("Result:" +result);
    }
    
    public static void main(String[] args) {
        
        Calculator c=new Calculator();
        c.sum(10);
        c.display();
        c.sum(10,20);
        c.display();
        c.sum(30, 20, 10);
        c.display();
        
    }
    
}
