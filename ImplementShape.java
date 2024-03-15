class shape 
{
    public void display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends shape
{
    public void display(){
        System.out.println("This is rectangular shape");
    }

}
class Circle extends shape 
{
    public void display(){
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle
{
    public void display(){
        super.display();
        System.out.println("Square is a rectangle");
    }
}
public class ImplementShape{

    public static void main (String args[])
    {
    Square square=new Square();
    square.display();
    }

}